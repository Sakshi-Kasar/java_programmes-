package sakshi;
import java.util.*;
public class product
{
int pid;
String name;
float price;
void accept()
{
	Scanner sc =new Scanner(System.in);
	System.out.println("enter pid name price");
	pid=sc.nextInt();
	name=sc.next();
	price=sc.nextFloat();
}
void disp()
{
	System.out.println(pid +" "+name+" "+price);
	
}
public static void main(String [] arg)
{
	Scanner sc=new Scanner(System.in);
	System.out.println("enter limit:");
	int n=sc.nextInt();
	product ob[]=new product[n];
	for(int i=0;i<n;i++)
	{
		ob[i]=new product();
		ob[i].accept();
	}
	float total=0;
	for(int i=0;i<n;i++)
	{
		ob[i].disp();
		total=total+ob[i].price;
		
	}
	System.out.println("total="+total);
	
}

	
	
	
}
