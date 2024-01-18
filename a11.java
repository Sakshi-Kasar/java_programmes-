package student;

import javax.swing.*;
import java.util.*;
import java.awt.*;
import java.awt.event.*;
 public class a11 extends JFrame implements Runnable,ActionListener
{
	JButton b1,b2,b3;
	JTextField t1;
	Thread t;
  a11()
	{
	setVisible(true);
	setSize(500,500);
	setLayout(new FlowLayout());
	t1=new JTextField(10);
	b1=new JButton("Resume");
	b2=new JButton("Suspend");
	b3=new JButton("Exit");

		t=new Thread(this);
		t.start();
		add(t1);add(b1);add(b2);add(b3);
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
	}
public void run()
{

	try
	{
		while(true)
		{
	t.sleep(1000);	
	Random r1=new Random();
	int r=r1.nextInt(255);
	int g=r1.nextInt(255);
	int b=r1.nextInt(255);
	Color c1=new  Color(r,g,b);
	t1.setBackground(c1);
		}
	}catch(Exception e)
	{
		System.out.println(" "+e);
	}
}
public void actionPerformed(ActionEvent ae)
{
	if(ae.getSource()==b1)
	{
		try{
			t.resume();
		}catch(Exception e)
	{
			System.out.println(" "+e);	
		}
	}
	if(ae.getSource()==b2)
	{
		try{
		t.suspend();
	}catch(Exception e)
		{
		System.out.println(" "+e);
		}
	}
	if(ae.getSource()==b3)
	{
		dispose();
	}
}

public static void main(String[] args)
   {
	  new a11();
	}

}
