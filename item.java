package sakshi;
import java.util.*;
public class item 
{
	int no;
	String name;
	float price;
	static int c=0;
	item()
	{
		c++;
		System.out.println("ob count="+c);
		no=11;
		name="pen";
		price=20;
	}
	item(int no,String name,float price)
	{
		c++;
		System.out.println("ob count="+c);
		this.no=no;
		this.name=name;
		this.price=price;
	}
	void disp()
	{
		System.out.println(no+" "+ name+" "+ price);
	}
	public static void main(String [] arg)
	{
		item ob=new item();
		item ob1=new item(12,"pen",76f);
		ob.disp();
		ob1.disp();
	}
	

}
