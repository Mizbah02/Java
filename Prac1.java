
//" "
import java.sql.*;
public class Prac1 {

	
	public static final String url ="jdbc:mysql://localhost:3306/?user=root";
	public static final String user="root";
	public static final String pass="Hcooh1@";
	
	public static void main(String[] args) {
		
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			
		}
		catch(ClassNotFoundException e)
		{
			 
			System.out.println(e.getMessage());
		}
		
		try {
			
			Connection con = DriverManager.getConnection(url,user,pass);
		    
			
		    Statement st= con.createStatement();
		    
		    
		
		} 
		catch (SQLException e) {
			
			System.out.println(e.getMessage());
			
		}

	}

}
