import java.sql.*;

public class JDBCConnection {
    public static void main(String[] args) throws Exception {

        Connection con = DriverManager.getConnection(
            "jdbc:mysql://localhost:3306/testdb",
            "root",
            "password"
        );

        System.out.println("Connected");
    }
}
