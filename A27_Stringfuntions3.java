package myAssignments;

public class A27_Stringfuntions3 
{
	
	public static void main(String[] args) 
	{
	  String name ="rotator";
	  String name1=name.toUpperCase();
	  String reverse="";
	    
	for(int i=name1.length()-1;i>=0;i--)
	{
	char c=name1.charAt(i);
	reverse=reverse+c;
	}
	System.out.println("This is The Reversed Value >>"+reverse);
	boolean check=name1.equals(reverse);
	if(check==true)
	{
	System.out.println("Yes The Given String Is Pailendrome");
	}
	else
	{
	System.out.println("Sorry The Given String Is NOT a Pailendrome");
	}
	String one="Java";
	String two="java";
	boolean check1=one.equals(two);
	System.out.println("The Given Equals String Is "+check1);
		
	String a="  A Very Good Moring !  ";
	String a1 = a.trim();
	System.out.println("The Given String Is Trimmed >>"+a1);
	}
	
	
	
	
	
	
	
	
	
	
	

}
