package ty_last;
import java.sql.*;
import java.awt.*;
import java.awt.event.*;

import javax.swing.*;
public class db7 extends JFrame implements ActionListener 
{
	JLabel rno,name,per,gender,clas;
	JTextField t1,t2,t3;
	Checkbox ch1,ch2,ch3;
	Checkbox r1,r2;
	PreparedStatement st=null;
	Connection con=null;
	JButton b1;
	CheckboxGroup cg1,cg2;
	
	
	db7()
	{
		try
		{
		setVisible(true);
		setSize(500,500);
		setLayout(new FlowLayout());
		rno =new JLabel("rno");
		name =new JLabel("name");
		per =new JLabel("per");
		gender =new JLabel("gender");
		clas =new JLabel("class");
		t1=new JTextField(10);
		t2=new JTextField(10);
		t3=new JTextField(10);
		b1=new JButton("save");
		cg1=new CheckboxGroup();
		cg2=new CheckboxGroup();
		ch1=new Checkbox("fy",false,cg1);
		ch2=new Checkbox("sy",false,cg1);
		ch3=new Checkbox("ty",false,cg1);
		r1=new Checkbox("male",false,cg2);
		r2=new  Checkbox("female",false,cg2);
		
		add(rno);add(t1);
		add(name);add(t2);
		add(per);add(t3);
		add(gender);add(ch1);
		add(ch2);add(ch3);
		add(clas);
		add(r1);add(r2);
		add(b1);
		b1.addActionListener(this);
		Class.forName("org.postgresql.Driver");
		con=DriverManager.getConnection("jdbc:postgresql://localhost/sak","postgres","sakshi");
		st=con.prepareStatement("insert into stud values(?,?,?,?,?)");
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		
	
	}
	public void actionPerformed(ActionEvent ae)
	{
		if(ae.getSource()==b1)
		{
			try
			{
			int rno=Integer.parseInt(t1.getText());
			String name=t2.getText();
			int per=Integer.parseInt(t3.getText());
			String clas="";
			if(ch1.getState())
				clas="fy";
			if(ch2.getState())
				clas="sy";
			if(ch3.getState())
				clas="ty";
			String gen=" ";
			if(r1.getState())
				gen="male";
			if(r2.getState())
				gen="female";
			st.setInt(1,rno);
			st.setString(2,name);
			st.setInt(3, per);
			st.setString(4,clas);
			st.setString(5,gen);
			int k=st.executeUpdate();
            if(k>=1)
            	JOptionPane.showMessageDialog(this, "insert succee");
            else
            	JOptionPane.showMessageDialog(this, "something went wrong");
            	
			}
			catch(Exception e)
			{
				System.out.println(e);
			}		
		}	
	}
	public static void main(String arg[])throws Exception
	{
		new db7();
	}
 

}
