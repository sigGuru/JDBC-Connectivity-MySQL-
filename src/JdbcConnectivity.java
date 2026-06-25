import java.sql.*;

public class JdbcConnectivity {

    public static void main(String[] args) throws SQLException {

        String query = "Select name From hosteller where hid = 23";
        String url ="jdbc:mysql://localhost:3306/hibernate_demo";
        String userName = "****";
        String password = "****";

        Connection connection = DriverManager.getConnection(url,userName,password);
        Statement statement = connection.createStatement();
        ResultSet rs = statement.executeQuery(query);

        rs.next();

        String res = rs.getString(1);
        System.out.println(res);

        connection.close();
    }
}
