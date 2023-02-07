package module5;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.SQLException;

import connectionUtil.ConnectionTool;

public class MataDataDemo {

	public static void main(String[] args) {
		ConnectionTool cotl = new ConnectionTool();
		
		try(Connection conn = cotl.getConnection()) {
			DatabaseMetaData mataData = conn.getMetaData();
			System.out.println(mataData.getDatabaseProductName());
			System.out.println(mataData.getDatabaseProductVersion());
			System.out.println(mataData.getDriverName());
			System.out.println(mataData.getDriverVersion());
			System.out.println(mataData.getURL());
			System.out.println(mataData.getUserName());
		}
		catch(SQLException e) {
			e.printStackTrace();
		}
	}

}
