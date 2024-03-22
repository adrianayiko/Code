import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
/**
 * The DatabaseSingleton class represents a singleton design pattern implementation for a database connection.
 * It ensures that only one instance of the DatabaseSingleton class is created and provides a global point of access to it.
 */
public class DatabaseSingleton {
    private static DatabaseSingleton instance;
    private Connection connection;


    // It establishes a database connection using the provided URL, username, and password.
    private DatabaseSingleton() {
        try {
            String url = "jdbc:yourdatabaseurl";
            String username = "yourusername";
            String password = "yourpassword";
            this.connection = DriverManager.getConnection(url, username, password);
        } catch (SQLException ex) {
            // handle any errors
            System.out.println("SQLException: " + ex.getMessage());
            System.out.println("SQLState: " + ex.getSQLState());
            System.out.println("VendorError: " + ex.getErrorCode());
        }
    }


    // Returns the instance of the DatabaseSingleton class.
    public static DatabaseSingleton getInstance() {
        // # If the instance is null, create a new instance of the DatabaseSingleton class.
        if (instance == null) {
            instance = new DatabaseSingleton();
        }
        return instance;
    }

    /**
     * Returns the connection object associated with the database.
     * @return the connection object
     */
    public Connection getConnection() {
        return connection;
    }
}