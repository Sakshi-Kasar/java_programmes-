package ty_last;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;
import java.awt.*;
import java.awt.event.*;

import javax.swing.*;
public class db5 extends JFrame implements ActionListener
{
	Label l1,l2,l3,l4;
	TextField t1,t2,t3,t4;
	Button b1,b2,b3;
	Statement st=null;
	Connection con=null;
	ResultSet rs=null;
	db5() throws Exception
	{
		setSize(500,500);
		setVisible(true);
		setLayout(new FlowLayout());
		l1=new Label("rno");
		l2=new Label("name");
		l3=new Label("java");
		l4=new Label("php");
		t1=new TextField(20);
		t2=new TextField(20);
		t3=new TextField(20);
		t4=new TextField(20);
		b1=new Button("save");
		b2=new Button("search");
		b3=new Button("delete");
		add(l1);add(t1);
		add(l2);add(t2);
		add(l3);add(t3);
		add(l4);add(t4);
		add(b1);add(b2);
		add(b3);
		Class.forName("org.postgresql.Driver");
		con=DriverManager.getConnection("jdbc:postgresql://localhost/sak","postgres","sakshi");
		st=con.createStatement();
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		
	}
	public static void main(String arg[])throws Exception
	{
	   new db5();	
	}
	
	public void actionPerformed(ActionEvent ae)
	{
		try
		{
		if(ae.getSource()==b1)
		{
			int rno=Integer.parseInt(t1.getText());
			String name=t2.getText();
			int java=Integer.parseInt(t3.getText());
			int php=Integer.parseInt(t4.getText());
			int k=st.executeUpdate("insert into student values('"+rno+"','"+name+"','"+java+"','"+php+"')");
			if(k>=1)
				System.out.println("insert suce");
			else
				System.out.println("not succ");
			st.close();
			con.close();
			
		}
	
		if(ae.getSource()==b2)
		{
		
				int no=Integer.parseInt(t1.getText());
				rs=st.executeQuery("select *from student where rno="+no);
				if(rs.next())
				{
					JOptionPane.showMessageDialog(this,"found"+"name="+rs.getString(2)+" "+"java="+rs.getInt(3));
				}
			    
				
				rs.close();
				
			}
				
		if(ae.getSource()==b3)
		{
			int rno=Integer.parseInt(t1.getText());
			int k=st.executeUpdate("delete from student where rno="+rno);
			if(k>=1)
				JOptionPane.showMessageDialog(this,"delete succes....");
			
			
			
		}
	
		}
		catch(Exception e)
		{
			System.out.println("error="+e);
		}
	
		
	}

}
