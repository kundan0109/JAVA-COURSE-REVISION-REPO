package ajdbc_API;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

import static ajdbc_API.Constants.*;

public class CHangingMultipleValue {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your id name age city");
        int id = scanner.nextInt();
        String name = scanner.next();
        int age = scanner.nextInt();
        String city = scanner.next();
        String sql = "update student set name = ?, age = ?, city = ? where id = ?";
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        preparedStatement.setString(1, name);
        preparedStatement.setInt(2, age);
        preparedStatement.setString(3, city);
        preparedStatement.setInt(4, id);

        int recordupdated = preparedStatement.executeUpdate();
        System.out.println("record updated " + recordupdated);


        connection.close();
        System.out.println("updated record");

    }
}
