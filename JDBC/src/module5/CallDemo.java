package module5;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.SQLException;

import connectionUtil.ConnectionTool;

public class CallDemo {

	public static void main(String[] args) {

		ConnectionTool cotl = new ConnectionTool();
		
		try(Connection conn = cotl.getConnection()) {
			CallableStatement prepareCall = conn.prepareCall("{Call get_customerid_and_order_date(?,?,?)}");
			prepareCall.setInt(1, 10442);
			prepareCall.registerOutParameter(2, java.sql.Types.NCHAR);
			prepareCall.registerOutParameter(3, java.sql.Types.DATE);
			prepareCall.execute();
			System.out.println(prepareCall.getString(2));
			System.out.println(prepareCall.getString(3));
		}
		catch(SQLException e) {
			e.printStackTrace();
		}

	}

}
