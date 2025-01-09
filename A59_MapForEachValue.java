package myAssignments;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class A59_MapForEachValue 
{

	public static void main(String[] args) {
		Map<String,Integer>m1=new HashMap<String,Integer>();
		m1.put("John", 01);
		m1.put("Sansa", 02);
		m1.put("Arya", 03);
		m1.put("Brandon", 04);
		m1.put("Bricon", 05);
		m1.put("Stark", 06);
		System.out.println(m1);
		
		 Collection<Integer> v = m1.values();
			System.out.println(v);
	System.out.println("Iteration Done For Map For Each ValueSet");
			for(Integer i: m1.values())
			{
				System.out.println(i);
			}
			
	}
	

}
