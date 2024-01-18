package ty_last;
import java.sql.*;
import java.util.*;
public class db6
{
	public static void main(String arg[])throws Exception
	{
		Class.forName("org.postgresql.Driver");
		Connection con=DriverManager.getConnection("jdbc:postgresql://localhost/sak","postgres","sakshi");
		PreparedStatement st=con.prepareStatement("insert into student values(?,?,?,?)");
		System.out.println("enter limit");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=0;i<n;i++)
		{
			System.out.println("enter rno name java php");
			int rno=sc.nextInt();
			String name=sc.next();
			int java=sc.nextInt();
			int php=sc.nextInt();
			st.setInt(1,rno);
			st.setString(2,name);
			st.setInt(3,java);
			st.setInt(4,php);
			st.executeUpdate();
		}
		
		st.close();
		con.close();
		
		
	}

}
