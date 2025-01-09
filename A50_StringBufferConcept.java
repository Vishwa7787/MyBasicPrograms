package myAssignments;

import java.util.HashMap;
import java.util.Map;

public class A50_StringBufferConcept
{

	public static void main(String[] args){
		StringBuffer s1 = new StringBuffer("Vishwaradhya");
		System.out.println(s1.append(" Ghantimath"));
		System.out.println(s1.insert(0, "Mr "));
        System.out.println(s1.replace(16, 26,"Shanmukhayya"));
        System.out.println(s1.delete(16, 28));
        System.out.println(s1.reverse());
        System.out.println(s1.capacity());
        System.out.println(s1.charAt(12));
        System.out.println(s1.length());
        System.out.println(s1.substring(1));
        System.out.println(s1.substring(14, 16));
        System.out.println(s1.reverse());
        
		}
}
