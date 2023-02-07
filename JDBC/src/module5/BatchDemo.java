package module5;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import connectionUtil.ConnectionTool;

public class BatchDemo {

	public static void main(String[] args) {
		
		ConnectionTool cotl = new ConnectionTool();
		try(Connection conn = cotl.getConnection()) {
			Statement stmt = conn.createStatement();
			stmt.addBatch("insert into mycustomers(name) values ('Bob5')");
			stmt.addBatch("UPDATE [dbo].[MyCustomers] SET [Name] = 'Bob6' WHERE id=2");
			stmt.addBatch("UPDATE [dbo].[MyCustomers] SET [Name] = 'Bob7' WHERE id=3");
			stmt.addBatch("insert into mycustomers(name) values ('Bob8')");
			stmt.addBatch("insert into mycustomers(name) values ('Bob9')");
			stmt.addBatch("Delete [dbo].[MyCustomers] WHERE id=4");
			int[] executeBatch = stmt.executeBatch();
			for(int i = 0 ; i< executeBatch.length;i++) {
				int j = executeBatch[i];
				System.out.println(j);
			}
		}
		catch(SQLException e) {
			e.printStackTrace();
		}
	}

}
