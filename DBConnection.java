package busReser;
import java.sql.*;
public class DBConnection {
	 
	private static final String url="jdbc:mysql://127.0.0.1:3306/busReserv";//last jdbc indicates db name
	private static final String username="root";
	private static final String password="indhu@123";
	public static Connection getConnection() throws SQLException
	{
		return DriverManager.getConnection(url,username,password);
	}
}
