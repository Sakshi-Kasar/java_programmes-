package sakshi;

import java.util.Scanner;

public class Student {
int rno;
String name;
float per;
void accept()
{
	Scanner sc=new Scanner(System.in);
	System.out.println("enter rno name per:");
	rno=sc.nextInt();
	name=sc.next();
	per=sc.nextFloat();
	
}
	void disp()
	{
	 System.out.println(rno+" "+name +" "+per);	
	}
	public static void main(String [] arg)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("limt:");
		int n=sc.nextInt();
		Student ob[]=new Student[n];
		for(int i=0;i<n;i++)
		{
			ob[i]=new Student();
			ob[i].accept();
		}
		float max=ob[0].per;
		int pos=0;
		for(int i=0;i<n;i++)
		{
			if(ob[i].per>max)
			{
				max=ob[i].per;
				pos=i;
		    }
		}
		ob[pos].disp();
	}
}
