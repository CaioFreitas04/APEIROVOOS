import java.sql.*;

public class DriverTest {

    public static void main(String args[]) {
        String url = "jdbc:postgresql://localhost:5432/DB_POO";
        String user = "postgres";
        String password = "senhadata";
        Connection conn = null;
        Statement stmt = null;
        ResultSet rs = null;

        try {
            Class.forName("org.postgresql.Driver");
            System.out.println("DRIVER OK");
        }
        catch(Exception e) {
            System.out.println("DRIVER ERROR");
            return;
        }

    }
}
