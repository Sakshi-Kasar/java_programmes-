package ty_last;

import java.sql.*;
import java.util.*;
public class db1
{
	public static void main(String arg[])
	{
		try
		{
			Class.forName("org.postgresql.Driver");
			Connection con=DriverManager.getConnection("jdbc:postgresql://localhost/sak","postgres","sakshi");
			Statement st=con.createStatement();
			Scanner sc=new Scanner(System.in);
			System.out.println("enter eno name");
			int eno=sc.nextInt();
			String name=sc.next();
			int k=st.executeUpdate("insert into emp1 values('"+eno+"','"+name+"')");
			if(k>=1)
			System.out.println("table insertion succes....");
			
			
			
		}
		catch(Exception e)
		{
			System.out.println("error="+e);
		}
		
		
	}
	

}
