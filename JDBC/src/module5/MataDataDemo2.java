package module5;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;

import connectionUtil.ConnectionTool;

public class MataDataDemo2 {

	public static void main(String[] args) {
		ConnectionTool cotl = new ConnectionTool();
		
		try(Connection conn = cotl.getConnection()) {
			String sql = "select * from Employees";
			PreparedStatement pstmt = conn.prepareStatement(sql);
			ResultSet rs = pstmt.executeQuery();
			ResultSetMetaData metaData = rs.getMetaData();
			System.out.println(metaData.getColumnCount());
			rs.next();
			for(int i = 1 ; i<=metaData.getColumnCount() ; i++ ) {
				System.out.println(metaData.getColumnName(i) + ":" + rs.getString(i));
			}
		}
		catch(SQLException e) {
			e.printStackTrace();
		}
	}

}
