package student;
import java.util.*;
public class t1 extends Thread
{
	String s;
	int n;
	t1(String s,int n)
	{
		start();
		this.s=s;
		this.n=n;
	}
synchronized public void run()
	{
		for(int i=0;i<n;i++)
		{
			try
			{
			System.out.println(s);
			sleep(300);
			
			}catch(Exception e)
			{
				System.out.println("error="+e);
			}
			
		}
		

	}
	public static void main(String arg[])
	{

		t1 ob=new t1("sakshi",23);
		t1 ob1=new t1("kasar",23);
		
	}
	
	

}
