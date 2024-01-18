package ty_last;
import java.sql.*;
public class database 
{
	public static void main(String arg[])throws Exception
	{
	Class.forName("org.postgresql.Driver");
	Connection con=DriverManager.getConnection("jdbc:postgresql://localhost/postgres","postgres","sakshi");
	Statement st=con.createStatement();
	int k=st.executeUpdate("insert into student12 values(101,'om',90)");
	if(k>=1)
		System.out.println("insert succes.....");
	
	}

}
