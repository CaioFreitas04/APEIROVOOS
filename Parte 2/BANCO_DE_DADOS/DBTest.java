import java.sql.*;

public class DBTest {

    public static void main(String args[]) {
        String url = "jdbc:postgresql://localhost:5432/DB_POO"; 
        String user = "postgres";
        String password = "senhadata";
        Connection conn = null;
        Statement stmt = null;
        ResultSet rs = null;

        //driver test;
        try {
            Class.forName("org.postgresql.Driver");
            System.out.println("DRIVER OK");
        }
        catch(Exception e) {
            System.out.println("DRIVER ERROR");
            return;
        }
        
        //attempting connection and reading from table;
        try {
            conn = DriverManager.getConnection(url, user, password);
            stmt = conn.createStatement();
            String query = "SELECT * FROM TESTE";
            rs = stmt.executeQuery(query);
            while(rs.next()) {
                System.out.println(rs.getString("ID") + " - " + rs.getString("NOME"));
            }
        }
        catch(SQLException e) {
            System.out.println(e.getMessage());
        }
        finally {
            try {
                if(rs != null) rs.close();
                if(stmt != null) stmt.close();
            }
            catch (SQLException ex) {
                System.err.println(ex.getMessage());
            }
        }
    }
}
