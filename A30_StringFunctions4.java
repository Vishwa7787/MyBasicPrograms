package myAssignments;
import java.util.Arrays;
public class A30_StringFunctions4 
{ static int countofalphabets=0;
  static int countofdigits=0;
  static int countofwhitespaces=0;

   public static void main(String[] args)
   {
	 String name=" Hello! 123@ jAvA_";
	 char[] c1=name.toCharArray();
	 System.out.println(Arrays.toString(c1));
	   
	 for(int i=0;i<c1.length;i++)
  {
	 boolean b1= Character.isAlphabetic(c1[i]);
	 if(b1==true)
	 {
	   countofalphabets++;
	 }
	 
	 boolean b2= Character.isDigit(c1[i]);
	 if(b2==true)
	 {
	   countofdigits++;
	 }
	 
	 boolean b3= Character.isWhitespace(c1[i]);
	 if(b3==true) 
	 {
	   countofwhitespaces++;
	 }		   
  }
	   System.out.println("Number of Alphabets= "+countofalphabets);
	   System.out.println("Number of digits= "+countofdigits);
	   System.out.println("Number of Spaces= "+countofwhitespaces);
      
	   int specials=c1.length-(countofalphabets+countofdigits+countofwhitespaces);
	   System.out.println("Number Of Special Characters= "+specials);

   }
	
	
	
	
	
	
	
	
	
	
	
}
