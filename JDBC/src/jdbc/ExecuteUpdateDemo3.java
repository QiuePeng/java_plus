package jdbc;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import connectionUtil.ConnectionTool;

public class ExecuteUpdateDemo3 {

	public static void main(String[] args) {
		String sql = "SELECT * "
				+ " FROM [Northwind].[dbo].[Errr]";

		
		ConnectionTool cotl = new ConnectionTool();
		try(Connection conn = cotl.getConnection()){
			Statement stmt = conn.createStatement();
			boolean execute =stmt.execute(sql);
			
			if(execute) {
				ResultSet rs = stmt.executeQuery(sql);
				while(rs.next()) {
					System.out.println(rs.getString(3));
				}
			}
			else {
				int updateCount = stmt.getUpdateCount();
				System.out.println("新增"+updateCount+"筆資料");
			}
		}
		catch(SQLException e) {
			e.printStackTrace();
		}

	}

}
