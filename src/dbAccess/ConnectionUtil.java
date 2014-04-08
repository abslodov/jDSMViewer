package dbAccess;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class ConnectionUtil {

	public static Connection getConnection() throws Exception {
		
		// Initialize connection settings
		String rhost = "localhost";
		String lport = "3306";
        Connection con = null;
        String driver = "com.mysql.jdbc.Driver";
        String url = "jdbc:mysql://" + rhost +":" + lport + "/";
        String db = "mydb";
        String dbUser = "root";
        String dbPasswd = "";
        
        // Create and return the connection
        Class.forName(driver);
  	  	con = DriverManager.getConnection(url+db, dbUser, dbPasswd);
  	  	
  	  	return con;
	}
}
