package mypackage.conn;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection_demo {
	private static final String url = "jdbc:postresql://localhost:5432/mydb";
	private static final String user = "postre";
	private static final String password = "TM-";
	
	public static Connection getConnection() {
		Connection connection = null;
		try {
			connection = DriverManager.getConnection(url, user, password);
		}
		catch(SQLException e) {
			System.err.print(e);
		}
		return connection;
	}
}
