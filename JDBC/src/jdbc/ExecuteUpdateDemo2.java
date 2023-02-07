package jdbc;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import connectionUtil.ConnectionTool;

public class ExecuteUpdateDemo2 {

	public static void main(String[] args) {
		String sql = "CREATE TABLE Errr2"
				+"(id int primary key,"
				+"username nvarchar(50),"
				+"pwd nvarchar(30))";
		
		ConnectionTool cotl = new ConnectionTool();
		try(Connection conn = cotl.getConnection()){
			Statement stmt = conn.createStatement();
			boolean execute =stmt.execute(sql);
			System.out.println("是否有新增Table"+execute); //Table建立成功,但會回傳false,因為沒有結果集(ResultSet)
		}
		catch(SQLException e) {
			e.printStackTrace();
		}

	}

}
