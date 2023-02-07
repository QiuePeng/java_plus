package jdbc;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import connectionUtil.ConnectionTool;

public class ExecuteUpdateDemo {

	public static void main(String[] args) {
		
		String sql = "insert into [pubs].dbo.test9 values " + "('sooo')"; 
		
		ConnectionTool cotl = new ConnectionTool();
		try(Connection conn = cotl.getConnection()) {
			 Statement stmt = conn.createStatement();
			int Update = stmt.executeUpdate(sql);
			System.out.println("新增"+Update+"筆資料");
		}catch(SQLException e) {
			e.printStackTrace();
		}

	}

}
