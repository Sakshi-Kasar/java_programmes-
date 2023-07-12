package sakshi;
import java.util.*;
class vehicle
{
	String company;
	float price;
	Scanner sc=new Scanner(System.in);
	void accept()
	{
		System.out.println("enter company price:");
		company=sc.next();
		price=sc.nextFloat();
	}
	
}
class lmv extends vehicle
{
	int milage;
	void milage()
	{
		System.out.println("enter milage");
		milage=sc.nextInt();
	}
	void disp()
	{
		System.out.println("milage="+milage);
	}
	
}
class hmv extends vehicle
{
	int capacity;
	void capacity()
	{
		System.out.println("enter capacity");
		capacity=sc.nextInt();
	}
	void disp(){
		System.out.println("capacity="+capacity);
	}
	
}

public class vdemo

{
	public static void main(String []arg)
	{
	Scanner sc=new Scanner(System.in);
	int n=0,n1=0,i;
	lmv ob[]=new lmv[10];
	hmv ob1[]=new hmv[10];
	int ch;
   do   
   {
	   System.out.println("1=lmv \n 2=hmv");
	   System.out.println("enter choice:");
	   ch=sc.nextInt();
	   switch(ch)
	   {
	   case 1:System.out.println("enter limit");
		      n=sc.nextInt();
	          for(i=0;i<n;i++)
	          {
	        	  ob[i]=new lmv();
	        	  ob[i].accept();
	        	  ob[i].milage();
	          }
	          for(i=0;i<n;i++)
	        	  ob[i].disp();
	          break;
	   case 2:   System.out.println("enter limit:");
		         n1=sc.nextInt();
                   for(i=0;i<n1;i++)
                   {
     	             ob1[i]=new hmv();
     	             ob1[i].accept();
     	             ob1[i].capacity();
                    }
                 for(i=0;i<n1;i++)
     	           ob1[i].disp();
                   break;   
	          
	          
	   }
	   
   }while(ch<3);
	

}
}
