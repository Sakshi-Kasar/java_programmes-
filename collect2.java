package student;
import java.util.*;
public class collect2
{
   public static void main(String[] args) 
	{
	   LinkedList l1=new LinkedList();
	   l1.add(45);
	   l1.add(56);
	   l1.add(78);  l1.add(78);
	   System.out.println(l1);
	   l1.addFirst(90);
	   l1.addLast(89);
	   System.out.println(l1);
	   System.out.println(l1.getFirst());
	   System.out.println(l1.getLast());
	   System.out.println(l1.indexOf(90));
	   l1.clear();
	   System.out.println(l1);
		
	}

}
