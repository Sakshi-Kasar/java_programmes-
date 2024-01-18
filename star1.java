package student;
import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;
import java.util.*;
public class star1 extends Applet  implements Runnable
{ 
	Thread t1;
	int x=100,y=100;
	int x1=130,y1=50;
	int x2=160,y2=100;
	int x3=100,y3=70;
	int x4=150,y4=70;
	public void init()
	{
	  t1=new Thread(this);	
	  t1.start();
	}
	public void update(Graphics g)
	{
	Random rd=new Random();

	g.setColor(new Color(rd.nextInt(255),rd.nextInt(255),rd.nextInt(255)));	
	g.drawLine(x,y,x1,y1);
	g.drawLine(x1,y1,x2,y2);
	g.drawLine(x2,y2,x3,y3);
	g.drawLine(x3,y3,x4,y4);
	g.drawLine(x4,y4,x,y);
	}

	public static void main(String[] args)
	{
		new star1();
		
	}

	public void run() 
	{
		try
		{
		while(true)
		{
			repaint();
			x=x-10;
			y1=y1-10;
			x2=x2+10;
	         x3=x3-10;
	         y3=y3-10;
		     x4=x4+10;
		     y4=y4-10;
			t1.sleep(2000);
		}
	 
		}catch(Exception e)
		{
			
		}
	}
	

}
