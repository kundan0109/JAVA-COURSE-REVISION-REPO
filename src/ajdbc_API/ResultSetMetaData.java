package ajdbc_API;

import java.sql.*;

public class ResultSetMetaData {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");

        String url = "jdbc:mysql://localhost:3306/isj010";
        String username = "root";
        String password = "user@0901";

        Connection connection = DriverManager.getConnection(url, username, password);

        Statement statement = connection.createStatement();

        String sql = "select * from  student";
        ResultSet resultSet = statement.executeQuery(sql);


        java.sql.ResultSetMetaData metaData = resultSet.getMetaData();
        System.out.println(metaData.getTableName(1));
        System.out.println(metaData.getColumnCount());


        connection.close();

    }
}
