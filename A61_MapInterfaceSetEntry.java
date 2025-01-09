package myAssignments;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class A61_MapInterfaceSetEntry 
{
	public static void main(String[] args) {
		Map<String,Character> m=new HashMap<String,Character>();
		m.put("Sarvesh", 'M');
		m.put("Sakshi", 'F');
		m.put("Manish", 'M');
		m.put("Anikit", 'M');
		m.put("Akshata", 'F');
      System.out.println(m);
      Set<Entry<String, Character>> e = m.entrySet();
      System.out.println(e);
System.out.println("Using Iteration by Set<Entry<String, Character>>");
      Iterator<Entry<String, Character>> it = e.iterator();
      while(it.hasNext())
      {
    	  System.out.println(it.next());
      }
      
	}
	
	
	
	
	

}
