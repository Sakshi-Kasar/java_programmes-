package sakshi;
import java.util.*;
public class product1 
{
int pid,qty;
String pname;
double cost;
static int c=0;
product1()
{
	c++;
	System.out.println("object count="+c);
	Scanner sc =new Scanner(System.in);
	System.out.println("enter pid pname qty cost");
	pid=sc.nextInt();
	pname=sc.next();
	qty=sc.nextInt();
	cost=sc.nextDouble();
	
}
product1(int pid,String pname,int qty,double cost)
{
	c++;
	System.out.println("object count="+c);
	this.pid=pid;
	this.pname=pname;
	this.qty=qty;
	this.cost=cost;
	
}
void disp()
{
	System.out.println(pid+" "+ pname+" "+ qty+" "+ cost);
}
public static void main(String [] arg)
{
	Scanner sc =new Scanner(System.in);
	product1 ob=new product1();
	System.out.println("enter limit:");
	int n=sc.nextInt();
	product1 ob1[]=new product1[n];
	
	for(int i=0;i<n;i++)
	{
	System.out.println("enter pid pname qty cost");
	int pid=sc.nextInt();
	String pname=sc.next();
	int qty=sc.nextInt();
    double cost=sc.nextDouble();
    ob1[i]=new product1(pid,pname,qty,cost);
	
   }
	ob.disp();
	for(int i=0;i<n;i++)
		ob1[i].disp();
	

}

}
