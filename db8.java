package ty_last;
import java.sql.*;
import java.util.*;
import java.util.*;
public class db8 
{
	public static void main(String arg[])throws Exception
	{
		Class.forName("org.postgresql.Driver");
		Connection con=DriverManager.getConnection("jdbc:postgresql://localhost/sak","postgres","sakshi");
		Scanner sc=new Scanner(System.in);
		PreparedStatement st=con.prepareStatement("create table emp2(eni int,sal int)");
		st.executeUpdate();
		 st=con.prepareStatement("insert into emp2 values(?,?)");
		for(int i=0;i<3;i++)
		{
			System.out.println("enter no sal");
			int no=sc.nextInt();
			int sal=sc.nextInt();
			st.setInt(1,no);
			st.setInt(2,sal);
			st.execute();
		}
		
		
		st=con.prepareStatement("select* from emp2 where sal=(select max(sal) from emp2)");
		ResultSet rs=st.executeQuery();
		while(rs.next())
		{
		System.out.println("no="+rs.getInt(1));
		System.out.println("sal="+rs.getInt(2));
		
		}
		
		
	}


}
