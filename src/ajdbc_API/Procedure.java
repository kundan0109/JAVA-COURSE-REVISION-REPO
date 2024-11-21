package ajdbc_API;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import static ajdbc_API.Constants.*;

public class Procedure {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);

        String sql = "create procedure isj010.bulk_insert()  "+
                "begin"+
                " insert into student (name, age, city) values('a', 55, 'pk');   "+
                " insert into student (name, age, city) values('b', 55, 'pk');   "+
                " insert into student (name, age, city) values('c', 55, 'pk');   "+
                " insert into student (name, age, city) values('d', 55, 'pk');   "+
                " "+
                "end";

        CallableStatement callableStatement = connection.prepareCall(sql);
        callableStatement.execute();
        System.out.println("Stored procedure");



    }
}
