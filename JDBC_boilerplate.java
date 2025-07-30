
//" "
import java.sql.*;
public class JDBC_boilerplate {

	
	public static final String url ="jdbc:mysql://localhost:3306/mydb";
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
		    
		    String query = "";
		    
		   
		    PreparedStatement pst = con.prepareStatement(query);

		    //pst.setInt(1, 102);
		    //pst.setString(0, query);
		   
		    int rs = pst.executeUpdate();
		    if(rs>0)
		    	System.out.println("Success");
		    else
		    	System.out.println("failed to insert");
		    
		
		} 
		catch (SQLException e) {
			
			System.out.println(e.getMessage());
			
		}

	}

}
