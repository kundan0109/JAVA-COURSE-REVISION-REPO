package ajdbc_API;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Createtable {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        String url = "jdbc:mysql://localhost:3306/isj010";
        String username = "root";
        String password = "user@0901";
        Connection connection = DriverManager.getConnection(url, username, password);
        Statement statement = connection.createStatement();
        String sql = "create table course(courseId int primary key auto_increment, courseName varchar(50), courseFees int , courseDuration varchar(50) ) ";
        statement.execute(sql);
        connection.close();
        System.out.println("Created");
    }
}
