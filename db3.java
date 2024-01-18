package ty_last;
import java.sql.*;
import java.util.*;
public class db3 
{
	public static void main(String arg[]) 
	
	{
		try
		{
		Class.forName("org.postgresql.Driver");
		Connection con=DriverManager.getConnection("jdbc:postgresql://localhost/sak","postgres","sakshi");
		Statement st=con.createStatement();
		System.out.println("enter eno to and update name ");
		Scanner sc=new Scanner(System.in);
		int eno=sc.nextInt();
		String name=sc.next();
		int k=st.executeUpdate("update emp1 set eno='"+eno+"' where name='"+name+ "'");
		if(k>=1)
			System.out.println("update succes.....");
		}
		catch(Exception e)
		{
			System.out.println("error="+e);
		}
		
	}

}
