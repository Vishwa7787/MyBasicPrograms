package myAssignments;

public class A25_StringFuntions
{

     public static void main(String[] args) 
    {
    	 String a="I Love MySelf";
	     int sum= a.length();
	     String up= a.toUpperCase();
	     String low= a.toLowerCase();
	     String reverse="";
	     for(int i=up.length()-1;i>=0;i--)
	     {
	    	 char c=up.charAt(i);
	    	 reverse=reverse+c;
	    	 
	     }
	 System.out.println("Characters Consists of>> "+sum);
	 System.out.println("Converted to Upper Case>> "+up);
	 System.out.println("Converted to Lower Case>> "+low);
	 System.out.println("reversed "+reverse);
    }
}
