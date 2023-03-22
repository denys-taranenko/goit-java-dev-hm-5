package databaseutil;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Database {

    private static Database instance;
    private Connection connection;

    private Database() {

    }

    public static Database getInstance() {

        if (instance == null) {
            instance = new Database();

            String URL = "jdbc:mysql://127.0.0.1:3306/?user=root";

            try {
                instance.connection = DriverManager.getConnection(URL);
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

        return instance;
    }

    public Connection getConnection() {
        return connection;
    }
}
