package student;
import java.util.*;
public class t22 
{
	String s;
	int n;
	t22(String s,int n)
	{
		
		this.s=s;
		this.n=n;
	}
  void run()
	{
		for(int i=0;i<n;i++)
		{
			try
			{
			System.out.println(s);
			
			}catch(Exception e)
			{
				System.out.println("error="+e);
			}
			
		}
		

	}
	public static void main(String arg[])
	{

		t22 ob=new t22("sakshi",23);
		ob.run();
		t22 ob1=new t22("kasar",23);
		ob1.run();
		
	}
	
	

}
