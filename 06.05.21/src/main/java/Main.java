import com.mysql.cj.jdbc.Driver;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) throws Exception {

        Connection connection = getConnection();
        String query = "select * from users";
        Statement statement = connection.prepareStatement(query);
        ResultSet resultSet = statement.executeQuery(query);

    }

    public static Connection getConnection() throws Exception {
        DriverManager.registerDriver(new Driver());
        return DriverManager.getConnection("jdbc:mysql://localhost/newdb", "root", "VeryDifficultPass");
    }

}
