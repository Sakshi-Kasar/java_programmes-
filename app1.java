package student;
import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;
public class app1 extends Applet implements Runnable
{
	Thread t1;
	static int i=0;
	int x=0;
	public void init()
	{
	 t1=new Thread(this);
	 t1.start();	
		
	}
	public void paint(Graphics g)
	{
		if(i%2==0)
		g.drawOval(x, 100, 40, 40);
		else
			g.drawOval(x,10,40,40);
		
		
		
	}
	public void run()
	{
		try
		{
		
		while(true)
		{
			i++;
			x=x+100;
			repaint();
			t1.sleep(1000);
			if(x==500)
				x=0;
			}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		
	}

}
