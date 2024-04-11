import java.sql.*;
import java.util.*;
import java.io.*;


/*
 *  COMO USAR:
 *
 *  - primeiro, chame o método connectToBank() para inciar a conexão com o servidor
 *    (que DEVE ESTAR ABERTO!)
 *
 *  - use o método writeCliente() para inserir um cliente no banco de dados;
 *
 *  - use o método fetchClientes() para receber um ArrayList contendo todos os clientes;
 *
 *  - caso haja algum erro, verifique se há um arquivo errlog.txt no diretório do programa -
 *    ele tem a função de registrar todos os erros causados pelo banco de dados;
 *
 */


public class BancoCliente {

	//queries;
	private static final String INSERT_QUERY = "INSERT INTO clientes(nome, cpf, ender, vip, compras, email) VALUES(?, ?, ?, ?, ?, ?)";
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
            pstmt.setString(1, c.getNome());
            pstmt.setString(2, c.getCPF());
            pstmt.setString(3, c.getAddr());
            pstmt.setBoolean(4, c.isVIP());
            pstmt.setInt(5, c.getCompras());
            pstmt.setString(6, c.getEmail());
            //enviando e fechando o statement;
            pstmt.executeUpdate();
            pstmt.close();
            return true;
        }
        catch(SQLException e) {
            logError(e.getMessage());
            return false;
        }
    }

    public static ArrayList<Cliente> fetchClientes() {
        try {
            //puxando clientes do banco de dados;
            PreparedStatement pstmt = conn.prepareStatement(SELECT_QUERY);
            ResultSet rs = pstmt.executeQuery();

            //reconstruindo e inserindo no ArrayList de retorno;
            ArrayList<Cliente> returnArray = new ArrayList<Cliente>();
            while(rs.next()) {
                String nome = rs.getString("nome");
                String cpf = rs.getString("cpf");
                String addr = rs.getString("ender");
                boolean VIP = rs.getBoolean("vip");
                int compras = rs.getInt("compras");
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
