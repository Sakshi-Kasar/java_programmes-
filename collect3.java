package student;
import java.util.*;
public class collect3
{
   public static void main(String[] args) 
  {
		TreeSet ts=new TreeSet();
		ts.add(80);
		ts.add(89);
		ts.add(80);
		ts.add(78);
		System.out.println(ts);
		System.out.println(ts.size());
		SortedSet s=ts.headSet(80);
		System.out.println(s);
		SortedSet s1=ts.tailSet(80);
		System.out.println(s1);
	   
	   
	   
	}

}
