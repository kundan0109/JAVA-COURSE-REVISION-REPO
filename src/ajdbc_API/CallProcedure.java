package ajdbc_API;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import static ajdbc_API.Constants.*;

public class CallProcedure {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);

        String sql = "call isj010.bulk_insert() ";

        CallableStatement callableStatement = connection.prepareCall(sql);
        callableStatement.execute();
        System.out.println("Stored procedure executed");



    }
}
