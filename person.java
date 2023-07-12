package sakshi;
import java.util.*;
public class person 
{
	int pid,phno;
	String name,add;
	
	void accept()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter pid phno name add:");
		pid=sc.nextInt();
		phno=sc.nextInt();
		name=sc.next();
		add=sc.next();
		
	}
	void disp()
	{
		System.out.println(pid+" "+phno+" "+name+" "+add);
		
	}
	static void search(person ob[],int n,int phno)

	{  int i;
		for( i=0;i<n;i++)
		{
			if(ob[i].phno==phno)
				break;
		}
		if(i!=n)
			ob[i].disp();
		else
			System.out.println("not found..");
	}
	public static void main(String [] arg)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter limit:");
		int n=sc.nextInt();
		person ob[]=new person[n];
		for(int i=0;i<n;i++)
		{
			ob[i]=new person();
			ob[i].accept();
		}
		for(int i=0;i<n;i++)
			ob[i].disp();
		System.out.println("enter phno to search:");
		int phn=sc.nextInt();
		
		search(ob,n,phn);	
		
	}

	}

