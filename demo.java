package sakshi;

import java.util.*;

public class demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter string");
		String s1=new String();
		Scanner sc=new Scanner(System.in);
		
		s1=sc.next();
		int i,f=0;
		for(i=0;i<s1.length();i++)
		{
			if(!(Character.isLetter(s1.charAt(i))))
					{
				      f=1;
					}
					
		}
		if(f==1)
			System.out.println("no valid");
		else
			System.out.println("valid");
			
    
	}
}