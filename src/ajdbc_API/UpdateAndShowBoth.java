package ajdbc_API;

import java.sql.*;

import static ajdbc_API.Constants.*;

public class UpdateAndShowBoth {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
        String sql1 = "update student set name = 'Merry Gen' where id = 12 ";
        Statement statement = connection.createStatement();
        int recordsUpdated = statement.executeUpdate(sql1);
        System.out.println("Record updated " + recordsUpdated);

//        EXECUTE SELECT QUERY
        String sql2 = "select * from student";
        ResultSet resultSet = statement.executeQuery(sql2);
        while ((resultSet.next())){
            System.out.println(resultSet.getInt(1) + " \t " + resultSet.getString(2) +
                    " \t " + resultSet.getInt(3) + " \t " + resultSet.getString(4));
        }
        connection.close();

    }
}
