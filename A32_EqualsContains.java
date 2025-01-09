package myAssignments;
public class A32_EqualsContains 
{
	public static void main(String[] args)
	{
		String s1="Hello";
		String s2="hello";
	    boolean b=s1.equals(s2);  //equals funtion
		if(b==true)
		{
			System.out.println("Yes The Given String Are Equal to eachother "+b);
		}
		else
		{
			System.out.println("The String Are Not Equal "+b);
		}
		boolean b1=s1.equalsIgnoreCase(s2);
		if(b1==true)
		{
			System.out.println("The Given String Are Equal Ignoring "
				+"Case Sensitivity "+b1);
		}
		else
		{
			System.out.println("The String Are Not Equal "+b1);
		}
		
		String a1="Getting hands-on with Java is fun.";
	    boolean b2= a1.contains("Java");
        if(b2==true)
        {
        	System.out.println("Yes The Given String Contains Java in it "+b2);
        }
        else
        {
        	System.out.println("NO The Given String Not Contains Java "+b2);
        }
        boolean b3=a1.contains("Python");
        if(b3==true)
        {
        	System.out.println("Yes The Given String Contains Python ");
        }
        else
        {
        	System.out.println("NO The Given String Not Contains Python In It "+b3);

        }
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	

}
