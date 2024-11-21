package ajdbc_API;

import java.net.URL;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import static ajdbc_API.Constants.*;

public class InsertMultipleRecord {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);

        String sql1 = "insert into student(name, age , city) values('Chaitali', 22, 'Chandrapur' )";
        String sql2 = "insert into student(name, age , city) values('Sanika', 22, 'Goa' )";
        String sql3 = "insert into student(name, age , city) values('Merry', 29, 'Bankok' )";

        Statement statement = connection.createStatement();
        statement.addBatch(sql1);
        statement.addBatch(sql2);
        statement.addBatch(sql3);

        int[] arrayOfRecords = statement.executeBatch();
        for (int temp : arrayOfRecords){
            System.out.println(temp + " \t ");
        }

        connection.close();
        System.out.println("batch added");

    }
}
