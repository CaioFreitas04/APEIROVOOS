import java.sql.*;
import java.util.*;
import java.io.*;

public class DBTemplate {

    static String url = "jdbc:postgresql://localhost:5432/DB_POO";
    static String user = "postgres";
    static String password = "senhadata";
    static Connection conn = null;
    static Statement stmt = null;
    static ResultSet rs = null;

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
            stmt = conn.createStatement();
            return true;
        }
        catch(SQLException e) {
            logError(e.getMessage());
            return false;
        }
    }

    public static boolean addToTeste(int ID, String NOME) {
        try {
            //construindo a query de inserção;
            String query = "INSERT INTO TESTE (\"ID\", \"NOME\") VALUES (" + ID + ", '" + NOME + "');";
            
            stmt.executeUpdate(query);
            return true;

        } catch(SQLException e) {
            logError(e.getMessage());
            return false;
        }
    }

    public static boolean getTeste() {
        try {
            String query = "SELECT * FROM TESTE";
            rs = stmt.executeQuery(query);
            while(rs.next()) {
                System.out.println(rs.getString("ID") + " - " + rs.getString("NOME"));
            }
            return true;
        }
        catch (SQLException e) {
            logError(e.getMessage());
            return false;
        }
    }
}
