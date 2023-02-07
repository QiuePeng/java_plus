package module5;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import connectionUtil.ConnectionTool;

public class DBtoFile {

	public static void main(String[] args) {
		ConnectionTool cotl = new ConnectionTool();
				
			try(Connection conn = cotl.getConnection()) {
				String sql = "select fileName, MyFile from [fileTable] where fileName = 'aaa.jpg'";
				PreparedStatement pstmt = conn.prepareStatement(sql);
				ResultSet rs = pstmt.executeQuery();
				
				while(rs.next()) {
					System.out.println(rs.getString(1));
					FileOutputStream fos = new FileOutputStream("C://java//123.jpg");
					InputStream binaryStream = rs.getBinaryStream(2);
					int data=0;
					while((data=binaryStream.read())!=-1) {
						fos.write(data);
					}
				
					fos.flush(); //沖出=>記憶體裡面的資料沖出到檔案中
					fos.close();
					binaryStream.close();
				}
			}
			catch(SQLException e) {
				e.printStackTrace();
			}
			catch(IOException e) {
				e.printStackTrace();
			}

	}

}
