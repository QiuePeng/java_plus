package connectionUtil;
import java.sql.SQLException;
import java.sql.DriverManager;
import java.sql.Connection;

public class ConnectionTool {
	private String url = "jdbc:sqlserver://localhost:1433;databaseName=Northwind;encrypt=false";
	private String user = "qiupeng";
	private String pwd = "1234";
	
	public Connection getConnection() throws SQLException{

			return DriverManager.getConnection(url, user, pwd);

	
		
	}
}
