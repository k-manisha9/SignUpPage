import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class dbconnection {

	private static final String DRIVERNAME = "oracle.jdbc.driver.OracleDriver";
	private static final String URL = "jdbc:oracle:thin:@localhost:1521:XE";
	/*
	 * for mySQL Drivername="com.mysql.jdbc.Driver";
	 * Url="jdbc:mysql://localhost:3306/database_name";
	 * 
	 */
	private static final String PASSWORD = "system";
	private static final String USERNAME = "system";

	public static Connection getConnection() {
		Connection con = null;
		try {
			// Registering driver
			Class.forName(DRIVERNAME);
			con = DriverManager.getConnection(URL, USERNAME, PASSWORD);
			System.out.println("Connection established");
		} catch (ClassNotFoundException ex) {
			System.out.println("Connection not established");
			ex.printStackTrace();
		} catch (SQLException e) {
			System.out.println("Connection not established");
			e.printStackTrace();
		} catch (Exception e1) {
			System.out.println("Connection not established");
			e1.printStackTrace();
		}
		return con;

	}

}
