package ajdbc_API;

import java.sql.*;
import java.sql.PreparedStatement;
import java.util.Random;
import java.util.Scanner;

public class BasedOnidPrepared {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        String url = "jdbc:mysql://localhost:3306/isj010";
        String username = "root";
        String password = "user@0901";
        Connection connection = DriverManager.getConnection(url, username, password);
        String sql = "select * from student where id = ? ";
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter id ");
        int id= scanner.nextInt();
        preparedStatement.setInt(1, id);
        ResultSet resultSet = preparedStatement.executeQuery();

        while (resultSet.next()){
            System.out.println(resultSet.getInt(1) + " \t " + resultSet.getString(2) + " \t " + resultSet.getInt(3) + " \t " + resultSet.getString(4));

        }
        connection.close();
    }
}
