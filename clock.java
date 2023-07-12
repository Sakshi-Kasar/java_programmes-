package sakshi;
import java.util.*;
public class clock 
{
	int hr,min,sec;
	 clock()
	{
		 System.out.println("enter hr min sec:");
		Scanner sc=new Scanner(System.in);
		hr=sc.nextInt();
		min=sc.nextInt();
		sec=sc.nextInt();
	}
	 void check()
	 {
		 if((hr>=1 && hr<=24)&&(min>=0 && min<=60)&&
				 (sec>=0 && sec<=60))
		 {
			 System.out.println("valid");
			 if((hr>=1 && hr<12) ||(hr==12 && min==0 && sec==0))
				 System.out.println(hr+":"+min+":"+sec +" "+ "AM");
			 else
				 System.out.println(hr+":"+min+":"+sec +" "+"PM");
		 }
		 else
			 System.out.println("not valid:");
	 }
	 public static void main(String [] arg)
	 {
		 clock ob=new clock();
		 ob.check();
	 }
}
