package student;
import student.*;
import java.util.*;
public class stud 
{
	public static void main(String arg[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter name rno 3 sub marks");
		String name=sc.next();
		int rno=sc.nextInt();
		int m1=sc.nextInt();
		int m2=sc.nextInt();
		int m3=sc.nextInt();
		studentinfo ob=new studentinfo();
		studper ob1=new studper();
		float p=ob1.per(m1,m2,m3);
		ob.disp(rno, name, p);
		
		
		
	}

	
	

}
