package myAssignments;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
public class A40_PropertiesOf_List 
{
public static void main(String[] args) 
{       List li = new ArrayList();
        li.add("Jhon");  //List Follows Indexing
        li.add("Sansa");  
        li.add(null);
        li.add(null);    //List Accepts one or More Null
        li.add("Bran");  
        li.add("Arya");  //List Accepts Duplicates
        li.add("Arya");
        System.out.println(li);
        
        List<String> l2 = new ArrayList<String> ();
        l2.add("Jhon");  
        l2.add("Sansa");  
        l2.add("Bran");
        l2.add("Arya");   
        l2.add("Bricon");  
        System.out.println(l2);
        Iterator<String> itr = l2.iterator();  //List Can Iterate With Iterator Method
        while(itr.hasNext())
        {
        	System.out.println(itr.next());
        }
        
        ListIterator<String> lis = l2.listIterator();
        System.out.println("Forward Iteration");
        while(lis.hasNext())
    	{
    	System.out.println(lis.next());      //Forward Iteration 
    	}
        System.out.println("Backward Iteration");
        while(lis.hasPrevious())
        {
        	System.out.println(lis.previous());
        }
        
        
  
        

       
          
        
        
          
	
}
	
	
	

}
