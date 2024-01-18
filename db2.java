package ty_last;
import java.sql.*;
import java.util.*;
public class db2 {

	public static void main(String arg[])
	{
		try
		{
			Class.forName("org.postgresql.Driver");
			Connection con=DriverManager.getConnection("jdbc:postgresql://localhost/sak","postgres","sakshi");
			Statement st=con.createStatement();
			Scanner sc=new Scanner(System.in);
	
			ResultSet rs=st.executeQuery("select * from emp1 where ");
			while(rs.next())
			{
			System.out.println("eno="+rs.getInt(1));
			System.out.println("name="+rs.getString(2));
			
			
			}
		
		}
		catch(Exception e)
		{
			System.out.println("error="+e);
		}
		
		
	}
	

}
