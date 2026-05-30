import java.sql.*;

public class JDBCInsert {
    public static void main(String[] args) throws Exception {

        Connection con = DriverManager.getConnection(
            "jdbc:mysql://localhost:3306/testdb",
            "root",
            "password"
        );

        String sql = "INSERT INTO student VALUES (1,'Bhagya')";
        Statement st = con.createStatement();
        st.executeUpdate(sql);

        System.out.println("Inserted");
    }
}
