package myAssignments;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class A41_PropertiesOf_Set
{
  public static void main(String[] args) 
  {
	Set s1 = new HashSet();
	s1.add("Ram");        //Set Doesn't Follows Indexing 
	s1.add("Laxman");
	s1.add(null);        
	s1.add(null);         //Set Does not Accept More Than One Null
	s1.add("Laxman");     //Set Does not Accept Duplicates 
	s1.add(1);
	System.out.println(s1);
	Iterator itr = s1.iterator(); //Set Can Only Iterate Using Iterator
	while(itr.hasNext())
	{
		System.out.println(itr.next());
	}
	
	
	
  }
}
