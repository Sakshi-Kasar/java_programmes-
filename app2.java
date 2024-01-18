package student;
import java.applet.Applet;
import java.awt.*;
import java.util.Random;
import java.awt.event.*;
public class app2 extends Applet implements Runnable
{
	Thread t1;
	public void init()
	{
		t1=new Thread(this);
		t1.start();
	}
	public void update(Graphics g)
	{
		Random rd=new Random();
		g.setColor(new Color(rd.nextInt(255),rd.nextInt(255),rd.nextInt(255)));
		int x1=rd.nextInt(500);
		int x2=rd.nextInt(500);
		int y1=rd.nextInt(500);
		int y2=rd.nextInt(500);
		g.drawRect(x1,y1,x2,y2);
		
	}
   public void run()
  {
	   try
	   {
	   while(true)
	   {
		   t1.sleep(1000);
		   repaint();
		   
		   
	   }
	   }
	   catch(Exception e)
	   {
		   System.out.println(e);
	   }
	
  }
   
}
