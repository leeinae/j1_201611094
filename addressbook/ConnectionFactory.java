package addressbook;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;


public class ConnectionFactory {
    private static Connection conn=null;
    private ConnectionFactory() {}
    public static Connection getConnection() {
        try {
            String path = System.getProperty("user.dir");
            path += "/src/mysql.persons";
            Properties prop = new Properties();
            prop.load(new FileInputStream(path));
            System.out.println("* DB connecting..."+prop.getProperty("URL"));
            Class.forName("com.mysql.jdbc.Driver");
            if(conn == null)
                conn = DriverManager.getConnection(
                    prop.getProperty("URL")+"?useSSL=true",
                    prop.getProperty("USER"),
                    prop.getProperty("PASSWORD")
                );
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return conn;
    }
}