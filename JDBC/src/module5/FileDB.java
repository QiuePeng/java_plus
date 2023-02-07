package module5;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import connectionUtil.ConnectionTool;

public class FileDB {

	public static void main(String[] args) {

		ConnectionTool cotl = new ConnectionTool();
		
		try(Connection conn = cotl.getConnection()) {
			String sql = "insert into fileTable(fileName,MyFile) values (?,?)";
			FileInputStream fis = new FileInputStream("C:/java/aaa.jpg");
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, "aaa.jpg");
			pstmt.setBinaryStream(2, fis);
			int count = pstmt.executeUpdate();
			System.out.println("OK"+count);
		}
		catch(SQLException e) {
			e.printStackTrace();
		}
		catch(IOException e) {
			e.printStackTrace();
		}
	}

}
