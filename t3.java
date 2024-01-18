package student;
import java.util.*;
public class t3 extends Thread
{
	String s;
	t3(String s)
	{
		this.s=s;
		start();
	}
	public void run()
	{
	  try
	  {
		  for(int i=0;i<s.length();i++)
		  {
			  if(s.charAt(i)=='a' || s.charAt(i)=='e'|| s.charAt(i)=='i'
					 || s.charAt(i)=='o'||s.charAt(i)=='u')
				  
			  {
				  System.out.println(s.charAt(i));
				  sleep(2000);
				  
				  
			  }
		  }
		  
		  
	  }catch(Exception e)
	  {
		  System.out.println(e);
	  }
			
	}
	public static void main(String arg[])
	{
		new t3("shrirampur");
	}
	
	
	

}
