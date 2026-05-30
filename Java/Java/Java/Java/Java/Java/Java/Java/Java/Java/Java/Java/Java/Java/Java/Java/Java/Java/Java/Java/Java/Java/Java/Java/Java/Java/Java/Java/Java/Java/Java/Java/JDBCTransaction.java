import java.sql.*;

public class JDBCTransaction {
    public static void main(String[] args) throws Exception {

        Connection con = DriverManager.getConnection(
            "jdbc:mysql://localhost:3306/testdb",
            "root",
            "password"
        );

        con.setAutoCommit(false);

        Statement st = con.createStatement();
        st.executeUpdate("INSERT INTO student VALUES (2,'A')");
        st.executeUpdate("INSERT INTO student VALUES (3,'B')");

        con.commit();

        System.out.println("Transaction Done");
    }
}
