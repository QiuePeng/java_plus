package module5;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.swing.JOptionPane;

import connectionUtil.ConnectionTool;

public class BatchDemo2 {

	public static void main(String[] args) {
		
		ConnectionTool cotl = new ConnectionTool();
		try(Connection conn = cotl.getConnection()) {
			String sql = "insert into mycustomers(name) values (?)";
			PreparedStatement stmt = conn.prepareStatement(sql);
			String name = "";
			while((name = JOptionPane.showInputDialog("name"))!=null) {
				stmt.setString(1, name);
				stmt.addBatch();
			}
			stmt.executeBatch();
			System.out.println("OK");
			}
		
		catch(SQLException e) {
			e.printStackTrace();
		}
	}
}