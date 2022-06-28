package level4.lesson7.reposity;

import level4.lesson7.model.City;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.*;
import java.util.Properties;
public class CityRepository {
    private Connection getConnection() {
        Properties properties = new Properties();
        try {
            properties.load(new FileInputStream("src/main/resources/jdbc.properties"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            Class.forName(properties.getProperty("driver-class-name"));
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        String url = properties.getProperty("url");
        String login = properties.getProperty("login");
        String password = properties.getProperty("password");

        try {
            return DriverManager.getConnection(url, login, password);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    public void update(City city) throws SQLException {
        Connection connection = getConnection();

        String sql = "UPDATE city SET name = ? WHERE id = ?";
        PreparedStatement statement = connection.prepareStatement(sql);
        statement.setString(1, city.name);
        statement.setInt(2, city.id);

        statement.execute();
        connection.close();
    }

    public void create(City city) throws SQLException {
        Connection connection = getConnection();

        String sql = "INSERT INTO city (name) VALUES (?)";
        PreparedStatement statement = connection.prepareStatement(sql);
        statement.setString(1, city.name);

        statement.execute();
        connection.close();
    }

    public void read() {
        Connection connection = getConnection();
    }

    public void delete(int id) throws SQLException {
        Connection connection = getConnection();

        String sql = "DELETE FROM city WHERE id = ?";
        PreparedStatement statement = connection.prepareStatement(sql);
        statement.setInt(1, id);

        statement.execute();
        connection.close();
    }
}
