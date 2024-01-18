package ty_last;
import java.sql.*;
public class db4 
{
	public static void main(String arg[])throws Exception
	{
		Class.forName("org.postgresql.Driver");
		Connection con=DriverManager.getConnection("jdbc:postgresql://localhost/sak","postgres","sakshi");
		Statement st=con.createStatement();
		int k=st.executeUpdate("delete from emp1 where name='sai'");
		if(k>=1)
			System.out.println("delete successsssssss.");
		
		
		
		
	}
	
	
	
	

}
