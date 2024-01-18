package ty_last;
import java.sql.*;
import java.util.*;
public class y2023
{
	public static void main(String arg[])
	{
		try
		{
		Class.forName("org.postgresql.Driver");
		Connection con=DriverManager.getConnection("jdbc:postgresql://localhost/sak","postgres","sakshi");
		Statement st=con.createStatement();
		ResultSet rs =st.executeQuery("select *from empp where eno=11");
	    if(rs.next())
	    System.out.println("found"+" "+rs.getString(2)+rs.getInt(3));
		}catch(Exception e)
		{
			System.out.println("error="+e);
		}
		
	}

}
