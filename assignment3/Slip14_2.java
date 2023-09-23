package assignment3;
import java.util.*;
public class Slip14_2 {
	

	
	
	            public static void main(String[] args)
	            {
	                        LinkedList ll=new LinkedList();
	                        ll.add("Apple");
	                        ll.add("Banana");
	                        ll.add("Guava");
	                        ll.add("Orange");
	                        Iterator i=ll.iterator();
	                        System.out.println("\ncontents of the List using an Iterator:\n");
	                        while(i.hasNext())
	                        {
	                                    String s=(String)i.next();
	                                    System.out.println(s);
	                        }

	                        ListIterator li = ll.listIterator();
	                        while(li.hasNext())
	                        {
	                                    // String elt = (String)
	                                    li.next();
	                        }
	                        System.out.println("\ncontents of the List in reverse order using a ListIterator : ");
	                        while(li.hasPrevious())
	                        {
	                                    System.out.println(li.previous());
	                        }
	                        
	            
	}
}
