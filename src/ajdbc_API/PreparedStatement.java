package ajdbc_API;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class PreparedStatement {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        String url = "jdbc:mysql://localhost:3306/isj010";
        String username = "root";
        String password = "user@0901";
        Connection connection = DriverManager.getConnection(url, username, password);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter name age city");
        String name = scanner.next();
        int age = scanner.nextInt();
        String city = scanner.next();
        String sql = "insert into student(name, age, city) values(?, ?, ?)   ";
        java.sql.PreparedStatement preparedStatement = connection.prepareStatement(sql);
        preparedStatement.setString(1,name);
        preparedStatement.setInt(2, age);
        preparedStatement.setString(3, city);
        preparedStatement.executeUpdate();
        connection.close();
        System.out.println("Record added successfully");

    }
}
