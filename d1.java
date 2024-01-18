package student;
import java.applet.*;
import java.util.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class d1 extends JFrame implements ActionListener,Runnable

{
	Button b1,b2;
	TextField t1;
	Thread th;
      d1()
      {
    	  th=new Thread(this);
    	  th.start();
    	  setSize(500,500);
    	  setLayout(new FlowLayout());
    	  setVisible(true);
    	   t1=new TextField(15);
    	   b1=new Button("start");
    	   b2=new Button("stop");
    	 
    	  b1.addActionListener(this);
    	  b2.addActionListener(this);
    	  add(t1);
    	  add(b1);
    	  add(b2);
      }
	
	
	public void actionPerformed(ActionEvent ae) 
	{
	
		if(ae.getSource()==b1)
		{
			th.resume();
			
		}
		if(ae.getSource()==b2)
		{
			th.suspend();
		}
		
		
	}
	public void run()
	{
		try
		{
			
		while(true)
		{
			th.sleep(100);
			Random rd=new Random();
			int n1=rd.nextInt(255);
			int n2=rd.nextInt(255);
			int n3=rd.nextInt(255);
			Color r1=new Color(n1,n2,n3);
			t1.setBackground(r1);	
			
		}
		}catch(Exception e)
		{
			System.out.println("error="+e);
			
		}
	
	}
	public static void main(String arg[])
	{
		new d1();
	}
	

}
