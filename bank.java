package sakshi;

import java.util.Scanner;

public class bank
  {
	int accno,balance;
	String hname;
	void accept()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter accno hname balance");
		accno=sc.nextInt();
		hname=sc.next();
		balance=sc.nextInt();
		
	}
	void disp()
	{
		System.out.println(accno +" "+hname+" "+balance);
	}
	void deposite(int amt)
	{
		balance=balance+amt;
		System.out.println("successful..");
	}
	void withdraw(int amt)
	{
		if(balance-amt>=500)
		{
			balance=balance-amt;
			System.out.println("successful..");
		
	   }
		else
			System.out.println("insufficient amount.");
		}
	public static void main(String [] arg)
	{
		Scanner sc=new Scanner(System.in);
		bank ob=new bank();
		ob.accept();
		int ch;
		do
		{
			System.out.println("1=deposite \n 2=withdraw \n 3=display");
			System.out.println("\n enter choice \n");
		    ch=sc.nextInt();
			switch(ch)
			{
			case 1:System.out.println("enter amt:");
			        int amt=sc.nextInt();
			        ob.deposite(amt);
			        break;
			case 2: System.out.println("enter amt:");
	                int amt1=sc.nextInt();
	                ob.withdraw(amt1);
	                break;   
			case 3:ob.disp();
			       break;
			}
			
		
			
		}while(ch<4);
	}
}
