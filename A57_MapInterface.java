package myAssignments;
import java.util.HashMap;
import java.util.Map;
public class A57_MapInterface 
{
	public static void main(String[] args) {
 Map<String,Integer>m1= new HashMap<String,Integer>();
 m1.put("Vinod", 67);
 m1.put("Ganesh", 34);
 m1.put("", null);
 System.out.println(m1);
 m1.remove("Sudhama");
 Map<String,Integer>m2= new HashMap<String,Integer>();
 m2.put("Shankar", 56);
 m2.put("Bhaskar", 25);
 m1.putAll(m2);     
 System.out.println("Added All Values...");
 System.out.println(m1);
System.out.println("If Both Equals...");
 System.out.println(m1.equals(m2));
 m1.replace("Shankar", 87);
 System.out.println("Replaced Value...");
 System.out.println(m1);
 m1.putIfAbsent("Divakar", 87);	
 System.out.println("Added The Missing Key/Value...");
 System.out.println(m1);	
 System.out.println("All Keys:>> "+m1.keySet());
 System.out.println("All Values:>> "+m1.values());
 System.out.println("Checking If Empty Key or Value:>> "+m1.isEmpty());
 System.out.println("If ContainsKey:>> "+m1.containsKey("Vinod"));
 System.out.println("If ContainsValue:>> "+m1.containsValue(87));
 m1.clear();
 System.out.println(m1);
 
		
		
		
	}

}
