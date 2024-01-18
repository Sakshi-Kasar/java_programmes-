package student;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class collect7 
{
	public static void main(String arg[])
	{
		ArrayList l1=new ArrayList();
		l1.add(""+34);
		l1.add(""+89);
		l1.add(""+67);
		l1.add(""+56);
		ListIterator i=l1.listIterator();
		while(i.hasNext())
		{
			String s1=(String) i.next();
			System.out.println(s1);
			i.set(" "+s1);
		}
		while(i.hasPrevious())
		{
			System.out.println(i.previous());
		}
	
		
	}

}
