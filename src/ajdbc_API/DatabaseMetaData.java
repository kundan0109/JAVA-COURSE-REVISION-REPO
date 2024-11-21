package ajdbc_API;

import java.sql.*;

public class DatabaseMetaData {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");

        String url = "jdbc:mysql://localhost:3306/isj010";
        String username = "root";
        String password = "user@0901";

        Connection connection = DriverManager.getConnection(url, username, password);


        java.sql.DatabaseMetaData metaData = connection.getMetaData();

        System.out.println(metaData.getMaxColumnsInIndex());
        System.out.println(metaData.getUserName());
        System.out.println(metaData.getConnection());


        connection.close();

    }
}
