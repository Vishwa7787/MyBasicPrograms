package myAssignments;

public class A51_StringBuilderConcept 
{
	public static void main(String[] args)
	{
		StringBuilder s1 = new StringBuilder("Lion King");
		System.out.println(s1.append(" Of Forest"));
		System.out.println(s1.insert(0, "The "));
		System.out.println(s1.replace(0, 8, "Who is The"));
		System.out.println(s1.delete(0, 7));
		System.out.println(s1.reverse());
		System.out.println(s1.capacity());
		System.out.println(s1.reverse());
		System.out.println(s1.charAt(4));
		System.out.println(s1.length());
		System.out.println(s1.substring(4));
		System.out.println(s1.substring(12, 18));
		
		
		}

}
