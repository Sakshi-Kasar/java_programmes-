package student;

import java.util.HashSet;
import java.util.TreeSet;

public class collect4 {

	public static void main(String[] args) 
	
	{
		HashSet hs=new HashSet();
		hs.add('A');
		hs.add('B');
		hs.add('C');
		hs.add('C');
		System.out.println(hs);
		hs.remove('C');
		System.out.println(hs);
      TreeSet ts=new TreeSet(hs);
      System.out.println(ts);       

	}

}
