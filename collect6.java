package student;

import java.util.Collection;
import java.util.HashMap;
import java.util.Set;


public class collect6 {

	public static void main(String[] args) 
	{
		HashMap hm=new HashMap ();
		hm.put("a", 235);
		hm.put(" b", 235);
		hm.put("f", 799);
		System.out.println(hm);
		Collection s=hm.values();
		System.out.println(s);
		
	}

}
