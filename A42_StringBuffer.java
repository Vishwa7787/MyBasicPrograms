package myAssignments;

public class A42_StringBuffer
{
	public static void main(String[] args) 
	{
	   StringBuffer s1 = new StringBuffer("Hello, World!");
	   s1.append(" How are you?");
	   s1.insert(7,"Java");
	   s1.delete(2, 5);
	   s1.reverse();
	   System.out.println(s1);
	}

}
