package ajdbc_API;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import static ajdbc_API.Constants.*;

public class InsertMultipleRecordTryCatch {
    public static void main(String[] args)  {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        Connection connection = null;
        try {
            connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        String sql1 = "insert into student(name, age , city) values('Chaitali', 22, 'Chandrapur' )";
        String sql2 = "insert into student(name, age , city) values('Sanika', 22, 'Goa' )";
        String sql3 = "insert into student(name, age , city) values('Merry', 29, 'Bankok' )";

        Statement statement = null;
        try {
            statement = connection.createStatement();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        try {
            statement.addBatch(sql1);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        try {
            statement.addBatch(sql2);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        try {
            statement.addBatch(sql3);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        int[] arrayOfRecords = null;
        try {
            arrayOfRecords = statement.executeBatch();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        for (int temp : arrayOfRecords){
            System.out.println(temp + " \t ");
        }

        try {
            connection.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        finally {
            System.out.println("TryCatch");
        }
        System.out.println("batch added");

    }
}
