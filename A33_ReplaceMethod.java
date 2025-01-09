package myAssignments;

public class A33_ReplaceMethod
{
	public static void main(String[] args)
	{
		String a="Hello! 123Bye 789 ";
		
		System.out.println(a.replaceAll("[0-9]",""));    //Replace all Numeric Values with Empty String
		
		System.out.println(a.replaceAll("[A-Z]",""));   //Replace all Capital letters Values with Empty String
		
		System.out.println(a.replaceAll("[a-z]",""));  //Replace all Lower letters Values with Empty String
		
		System.out.println(a.replace('e','y'));       //Replace "e" letters Values with "y" String
	
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
