package myAssignments;

import java.util.Enumeration;
import java.util.Vector;

public class A56_EnumertationConcept
{
	public static void main(String[] args) {
		Vector<String> v1=new Vector<String>();
		v1.add("Dog");
		v1.add("Cat");
		v1.add("Cow");
		v1.add("Sheep");
		v1.add("Monkey");
		System.out.println(v1);
		
		System.out.println("_____________");
		Enumeration<String> e1 = v1.elements(); //Enumeration Achieved
		while(e1.hasMoreElements())
	    {
	    	System.out.println( e1.nextElement() );
	    }
		System.out.println("_____________");

		System.out.println("Enumeration Achieved ");
	    
		
	}

}
