package ty_last;
import java.sql.*;
public class pd 

{
	public static void main(String arg[])throws Exception
	{
		Class.forName("org.postgresql.Driver");
		Connection con=DriverManager.getConnection("jdbc:postgresql://localhost/sak","postgres","sakshi");
		PreparedStatement st=con.prepareStatement("update student set java=?,php=? where rno=?");
		st.setInt(1, 999);
		st.setInt(2,999);
		st.setInt(3,12);
		int k=st.executeUpdate();
		if(k>=1)
			System.out.println("delete succes....");
		
	}
	

}
