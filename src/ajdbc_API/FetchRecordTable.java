package ajdbc_API;

import java.sql.*;

public class FetchRecordTable {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        String url = "jdbc:mysql://localhost:3306/isj010";
        String username = "root";
        String password = "user@0901";
        Connection connection = DriverManager.getConnection(url, username, password);
        Statement statement = connection.createStatement();

        String sql = "select * from student ";
        ResultSet resultSet = statement.executeQuery(sql);

        while (resultSet.next()){
            System.out.println(resultSet.getInt(1) + " \t " + resultSet.getString(2) + " \t " + resultSet.getInt(3) + " \t " + resultSet.getString(4));

        }
connection.close();
    }
}
