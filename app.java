package student;
import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;
public class app extends Applet implements Runnable

{
	Thread t1;
	int i=0;
	public void init()
	{
		t1=new Thread(this);
		t1.start();
		
	}
	public void paint(Graphics g)
	{
		g.fillRect(100, 100,90,160);
		g.setColor(Color.black);
		g.drawLine(100,160,190,160);
		g.drawLine(100,210,190,210);
		g.fillRect(130,250,40,100);
		if(i==1)
		{
		g.setColor(Color.red);
		g.fillOval(100,100,50,50);
		
		}
		if(i==2)
		{
			g.setColor(Color.green);
		    g.fillOval(100,160,50,50);
		   
		}
		if(i==3)
		{
			g.setColor(Color.yellow);
	        g.fillOval(100,210,50,50);
		}
	}
	
	public void run()
	{
		try
		{
			while(true)
			{
	    	i++;
	    	repaint();
	    	t1.sleep(2000);
		   if(i==4)
			i=0;
			}
		
		}catch(Exception e)
		{
			System.out.println(e);
		}
		
		
	}
	

}
