package sakshi;
import java.util.*;
abstract class order
{
	int id;
	String description;
	Scanner sc=new Scanner(System.in);
	abstract void accept();
	abstract void disp();
}
class purchase extends order
{
	String cname;//customer name....
	void accept()
	{
		System.out.println("enter id description cname:");
		id=sc.nextInt();
		description=sc.next();
		cname=sc.next();
		
	}
	void disp()
	{
		System.out.println(id +" "+description+" "+cname);
	}
}
class sales extends order
{
	String vname;//vendor name.....
	void accept()
	{
		System.out.println("enter id description vname:");
		id=sc.nextInt();
		description=sc.next();
		vname=sc.next();
		
	}
	void disp()
	{
		System.out.println(id +" "+description+" "+vname);
	}
}

public class md
{
	public static void main(String [] arg)
	{
	  purchase p1,p2,p3;
	  p1=new purchase();
	  p2=new purchase();
	  p3=new purchase();
	  p1.accept();
	  p2.accept();
	  p3.accept();
	  p1.disp();
	  p2.disp();
	  p3.disp();
	  sales s1,s2,s3;
	  s1=new sales();
	  s2=new sales();
	  s3=new sales();
	  s1.accept();
	  s2.accept();
	  s3.accept();
	  s1.disp();
	  s2.disp();
	  s3.disp();
	  
	}

}
