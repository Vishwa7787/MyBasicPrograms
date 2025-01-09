package myAssignments;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class A63_ListIteratorFunctions
{
	public static void main(String[] args) 
	{
		List <String>l1 = new ArrayList<String>();
	    l1.add("Lion");
	    l1.add("Tiger");
	    l1.add("Elephant");
	    l1.add("Gorilla");
	    l1.add("Fox");
	    l1.set(3, "Monkey");
	    System.out.println(l1);
		
	    ListIterator<String> list = l1.listIterator();
	    
	    System.out.println("Forward Iteration....");
	    System.out.println("__________");
	  while(list.hasNext())
	    {
	    	System.out.println(list.next());
	    }
	    System.out.println("Backward Iteration....");
	    System.out.println("__________");
	  while(list.hasPrevious())
	    {
	    	System.out.println(list.previous());
	    }
	  
	  
	  
	}

}
