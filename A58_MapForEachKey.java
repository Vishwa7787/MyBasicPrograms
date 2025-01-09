package myAssignments;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class A58_MapForEachKey {

	public static void main(String[] args) {
		Map<String,Integer>m1=new HashMap<String,Integer>();
		m1.put("John", 01);
		m1.put("Sansa", 02);
		m1.put("Arya", 03);
		m1.put("Brandon", 04);
		m1.put("Bricon", 05);
		m1.put("Stark", 06);
		System.out.println(m1);
		
		 Set<String> k = m1.keySet();
		System.out.println(k);
System.out.println("Iteration Done For Map For Each KeySet");
		for(String s1: m1.keySet())
		{
			System.out.println(s1);
		}
		
	
		
		
	}
}
