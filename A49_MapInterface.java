package myAssignments;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class A49_MapInterface 
{
	public static void main(String[] args) {
	Map<String,Object> m1 = new HashMap<String,Object>();
	m1.put("Vishwaradhya", 78);
	m1.put("Karnataka Bank Ltd", 65601);
	m1.put("Vishwaradhya", "Ghantimath");
	m1.put("Bread", 5);
	m1.put("Coffee Powder", 4);
	m1.put("Tea Powder", 3);
	m1.put("Milk", 2);
	System.out.println(m1);

   for(Entry<String, Object> s1: m1.entrySet())
   {
	 System.out.println(s1);
   }
	
	
	}
}
