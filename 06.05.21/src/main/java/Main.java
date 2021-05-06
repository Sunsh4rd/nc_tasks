import com.mysql.cj.jdbc.Driver;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) throws Exception {

        List<User> users = new ArrayList<>();
        Connection connection = getConnection();
        String query = "select * from users";
        Statement statement = connection.prepareStatement(query);
        ResultSet resultSet = statement.executeQuery(query);

        while (resultSet.next())
            users.add(new User(resultSet.getInt("id"), resultSet.getString("username")));

        users.forEach(System.out::println);
    }

    private static Connection getConnection() throws Exception {
        DriverManager.registerDriver(new Driver());
        return DriverManager.getConnection("jdbc:mysql://localhost/newdb", "root", "VeryDifficultPass");
    }

}
