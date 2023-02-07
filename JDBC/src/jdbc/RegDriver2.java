package jdbc;

import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Enumeration;
import java.util.Iterator;

public class RegDriver2 {

	public static void main(String[] args) {
//用Map (key,value): System.setProperty("jdbc.drivers","com.microsoft.sqlserver." +"jdbc.SQLServerDriver");
		
/* DirverManager.registerDriver*/		
		try {
			DriverManager.registerDriver(new com.microsoft.sqlserver.jdbc.SQLServerDriver());
		}
		catch(SQLException e) {
			e.printStackTrace();
		} 
		
/*新型載入方式*/	
		Enumeration<Driver> drivers = DriverManager.getDrivers(); //從DriverManager取驅動程式
		Iterator<Driver> driIter = drivers.asIterator();// 轉換成迭帶器
		driIter.forEachRemaining(System.out::println); 
	}
	

}
