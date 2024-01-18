package student;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;
public class ball extends Applet implements Runnable
{
	Thread t1;
	static int i=0;
	int x=0,y=0,z=0;
   public void init()
   {
	   t1=new Thread(this);
	   t1.start();
   }
   public void paint(Graphics g)
   {
	
	  g.setColor(Color.red);
	   g.fillOval(100,y,40,40);
	   g.setColor(Color.green);
	   g.fillOval(150,z,40,40);
	   g.setColor(Color.yellow);
	   g.fillOval(200,x,40,40);
	
	   }
	   
	public static void main(String[] args) 
	{
     new ball();		

	}

	
	public void run()
	{
		try
		{
		while(true)
		{
		y=y+20;
		x=x+10;
		z=z+10;
		repaint();
		t1.sleep(200);
		if(y==200)
		y=0;
		if(x==200)
			x=0;
		if(z==200)
			z=0;
		
		}
		}
		catch(Exception e)
		{
			
		}
		
	}

}
