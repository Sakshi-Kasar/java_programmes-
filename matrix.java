package sakshi;
import java.util.*;
public class matrix 
{
	public static void main(String [] arg)
	{
		Scanner sc=new Scanner(System.in);
		int m,n;
		System.out.println("enter limit:");
		m=sc.nextInt();
		n=sc.nextInt();
		int a[][]=new int[m][n];
		int b[][]=new int[m][n];
		System.out.println("enter first matrix:");
		int i,j;
		for(i=0;i<m;i++)
		{
			for(j=0;j<n;j++)
			{
				 a[i][j]=sc.nextInt();
			}
		}
		System.out.println("enter second matrix:");
		for(i=0;i<m;i++)
		{
			for(j=0;j<n;j++)
			{
				 b[i][j]=sc.nextInt();
			}
		}
		int ch;
		 do
		 {
			 System.out.println("1=addition \n 2=multiplication\n");
			 System.out.println("3=transpose \n 4=lowersum \n 5=upper \n enter choice ");
			 ch=sc.nextInt();
			 switch(ch)
			 {
			 case 1:int c[][]=new int[m][n];
			        for(i=0;i<m;i++)
			        {
			        	for(j=0;j<n;j++)
			        	{
			        		c[i][j]=a[i][j]+b[i][j];
			        		System.out.print(c[i][j] +" ");
			        	}
			        	System.out.println(" ");
			        }
			        break;
			 case 2:int d[][]=new int[m][n];
			        int k;
				   for(i=0;i<m;i++)
			        {
			        	for(j=0;j<n;j++)
			        	{
			        		for(k=0;k<n;k++)
			        		{
			        			
			        		d[i][j]+=a[i][k]*b[k][j];
			        		
			        	   }
			        	  
			             }
			        
			          }
				    for(i=0;i<m;i++)
				    {
				    	for(j=0;j<n;j++)
				    	{
				    		System.out.print(d[i][j]+" ");
				    	}
				    	System.out.println();
				    }
				   
				   break;
			 case 3://transpose matrix of a
				    for(i=0;i<m;i++)
				    {
				    	for(j=0;j<n;j++)
				    	{
				    		System.out.print(a[j][i]+" ");
				    	}
				    	System.out.println(" ");
				    }
				  //transpose matrix of b
				    for(i=0;i<m;i++)
				    {
				    	for(j=0;j<n;j++)
				    	{
				    		System.out.print(b[j][i]+" ");
				    	}
				    	System.out.println(" ");
				    }
				    
				    break;
			 case 4://lower triangular sum
				    int sum=0;
				    for(i=0;i<m;i++)
				    {
				    	for(j=0;j<n;j++)
				    	{
				    		if(j>i)
				    		sum=sum+a[i][j];
				    	}
				    }
				    System.out.println(" lower triang sum="+sum);
				    break;
			 case 5: int sum1=0;
			     for(i=0;i<m;i++)
			     {
			    	for(j=0;j<n;j++)
			    	{
			    		if(i>j)
			    		sum1=sum1+a[i][j];
			    	}
			     }
			    System.out.println(" upper triang sum="+sum1);
			    break;
			 case 6:System.out.println("invalid choice..");
			       break;
		 
			 }
			  
		 }while(ch<7);	
		
	      }
	}
