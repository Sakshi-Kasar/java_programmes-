package student;
import java.util.*;
public class collect5 
{
     public static void main(String arg[])
     {
    	 	TreeMap tm =new TreeMap();
    	 	tm.put("a",45677);
    	 	tm.put("b",65677);
    	 	System.out.println(tm);
    	 	tm.remove("b");
    	 	System.out.println(tm.get("a"));
    	 	SortedMap am=tm.tailMap("a");
    	 	System.out.println(am);
     }
}
