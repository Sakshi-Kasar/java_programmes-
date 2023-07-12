package sakshi;
import java.util.*;
public class player 
{
int pid,totalrun,inning,notout;
String name;
float avg;
void accept()
{
	Scanner sc=new Scanner(System.in);
	System.out.println("enter pid name totalrun inning notout:");
	pid=sc.nextInt();
	name=sc.next();
	totalrun=sc.nextInt();
	inning=sc.nextInt();
	notout=sc.nextInt();
}
void disp()
{
	System.out.println(pid+" "+name+" "+totalrun+" "+inning+" "+notout+ " "+avg);
	
}
static void avg(player ob[],int n)

{
	for(int i=0;i<n;i++)
	{
		ob[i].avg=(float)ob[i].totalrun/(ob[i].inning-ob[i].notout);
	}
}
public static void main(String [] arg)
{
	Scanner sc=new Scanner(System.in);
	System.out.println("enterv limit:");
	int n=sc.nextInt();
	player ob[]=new player[n];
	for(int i=0;i<n;i++)
	{
		ob[i]=new player();
		ob[i].accept();
	}
	ob[0].avg(ob,n);
	for(int i=0;i<n;i++)
		ob[i].disp();
	
}

}
