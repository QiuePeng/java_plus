package connectionUtil;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JOptionPane;


public class ConnectionTest {

	public static void main(String[] args) {
		ConnectionTool cotl = new ConnectionTool();
		String lastName = JOptionPane.showInputDialog("LastName");
		String firstName = JOptionPane.showInputDialog("FirstName");
		
		String sql = "SELECT [EmployeeID],[LastName],[FirstName],[Title],[TitleOfCourtesy]"
					 		+ ",[BirthDate],[HireDate],[Address],[City],[Region],[PostalCode]"
					 		+ ",[Country],[HomePhone],[Extension] ,[Photo],[Notes]"
					 		+ ",[ReportsTo],[PhotoPath] "
					 		+ "FROM [dbo].[Employees] where Lastname ='" +lastName+"' and FirstName = '"+firstName+"'";
			    	       //22行 會被駭客攻擊(SQL注入攻擊) where Lastname ='" +lastName+"' and FirstName = '"+firstName+"'"
			      
		try(Connection conn = cotl.getConnection()) {
			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery(sql);
			
			while (rs.next()) {
			System.out.println(rs.getString(sql));
			}
		}
		catch(SQLException e) {
			e.printStackTrace();
		}

	}

}
