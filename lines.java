package student;

import java.util.ArrayList;

public class lines 
{
	public static void main(String arg[])
	{
		ArrayList<Integer> a=new ArrayList();
		a.add(67);
		a.add(89);
		a.addAll(a);
		System.out.println(a);
		System.out.println(a.remove(1));
		System.out.println(a);
		System.out.println(a.get(2));
		a.set(2,78);
		System.out.println(a);
	}

}
