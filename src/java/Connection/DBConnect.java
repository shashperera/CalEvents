/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Connection;

/**
 *
 * @author Lini Eisha
 */
import java.sql.*;

public class DBConnect {

    private static DBConnect connect;
    private Connection con;
    private String url, username, password;

    private DBConnect() {
        this.url = "jdbc:mysql://localhost:3306/calevents";
        this.username = "root";
        this.password = "";

    }

    public static DBConnect getInstance() {
        if (connect == null) {
            synchronized (DBConnect.class) {
                if (connect == null) {
                    connect = new DBConnect();
                }
            }
        }
        return connect;
    }

    public boolean isConnected() throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.jdbc.Driver");

        con = DriverManager.getConnection(url, username, password);

        if (con != null) {
            return true;
        } else {
            return false;
        }
    }

    public Connection getCon() throws ClassNotFoundException, SQLException {
        if (isConnected()) {
            return con;
        }
        else {
            return null;
        }
    }
}
