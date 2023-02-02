package jdbc;

public class RegDriver1 {

	public static void main(String[] args) {
		
/*Class.forName*/		
		try {
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
			System.out.println("OK");
		}
		catch (ClassNotFoundException e){
			System.out.println("Not OK");
			e.printStackTrace();
		}
		

	}

}
