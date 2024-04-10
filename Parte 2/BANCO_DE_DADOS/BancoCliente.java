import java.sql.*;
import java.util.*;
import java.io.*;

public class DBTest {

	//queries;
	private static final String INSERT_QUERY = "INSERT INTO clientes(nome, cpf, end, \"IsVIP\", \"numCompras\", email) VALUES(?, ?, ?, ?, ?, ?)";
	private static final String SELECT_QUERY = "SELECT * FROM clientes";

    private static String url = "jdbc:postgresql://localhost:5432/DB_POO"; 
    private static String user = "postgres";
    private static String password = "senhadata";
    private static Connection conn = null;

    public static void logError(String errMessage) {
        //essa função serve para debugging, escrevendo erros ocorridos em um arquivo
        //para mais fácil leitura (e não chamar uma janela de terminal. Espero);
        BufferedWriter fp = null;
        try {
            fp = new BufferedWriter(new FileWriter(new File("errlog.txt")));
            fp.write(errMessage);
            fp.flush();
            fp.close();
        }
        catch(IOException e) {
            e.printStackTrace();
        }
    }

    public static boolean connectToBank() {
        try {
            Class.forName("org.postgresql.Driver");
        }
        catch(Exception e) {
            logError("FATAL: NO_DRIVER");
            return false;
        }

        try {
            conn = DriverManager.getConnection(url, user, password);
            return true;
        }
        catch(SQLException e) {
            logError(e.getMessage());
            return false;
        }
    }

    public static boolean writeCliente(Cliente c) {
        try {
            //preparando a query;
            PreparedStatement pstmt = conn.prepareStatement(INSERT_QUERY);
            ps.setString(1, c.getNome());
            ps.setString(2, c.getCPF());
            ps.setString(3, c.getAddr());
            ps.setBoolean(4, c.isVIP());
            ps.setInt(5, c.getCompras());
            ps.setString(6, c.getEmail());
            //enviando e fechando o statement;
            ps.executeUpdate();
            ps.close();
            return true;
        }
        catch(SQLException e) {
            logError(e.getMessage());
        }
    }

    public static ArrayList<Cliente> fetchClientes() {
        try {
            //puxando clientes do banco de dados;
            PreparedStatement pstmt = conn.prepareStatement(SELECT_QUERY);
            ResultSet rs = pstmt.executeQuery();

            //reconstruindo e inserindo no ArrayList de retorno;
            ArrayList<Cliente> returnArray = new ArrayList<Cliente>();
            while(ps.next()) {
                String nome = rs.getString("nome");
                String cpf = rs.getString("cpf");
                String addr = rs.getString("end");
                boolean VIP = rs.getBoolean("\"IsVIP\"");
                int compras = rs.getInt("\"numCompras\"");
                String email = rs.getString("email");
                returnArray.add(new Cliente(nome, cpf, addr, VIP, compras, email));
            }
            pstmt.close();
            rs.close();
            return returnArray;
        }
        catch(SQLException e) {
            logError(e.getMessage());
            return null;
        }

    }
    
}
