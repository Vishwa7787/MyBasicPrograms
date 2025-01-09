package myAssignments;

public class A43_StringBuilder 
{ 
	public static void main(String[] args) 
   {
		StringBuilder s2 = new StringBuilder("Hello, World!");
		s2.append(" How Are You?");
		s2.insert(7,"Java");
		s2.delete(2, 5);
		s2.reverse();
		System.out.println(s2);
	
   } 

}
