package myAssignments;

import java.util.Arrays;

public class A31_AnagramProblem 
{
	public static void main(String[] args) 
	{
	  String a="listen";
	  String b="silent";
	        char[]c1=a.toCharArray();
	        char[]c2=b.toCharArray();
	   Arrays.sort(c1);
	   Arrays.sort(c2);
	   System.out.println(Arrays.toString(c1));
	   System.out.println(Arrays.toString(c2));
	  boolean b1=Arrays.equals(c1, c2);
	  if(b1==true)
	  {
		  System.out.println("Yes The Given Strings Are Anagrams");
	  }
	  else
	  {
		  System.out.println("They are Not Anagram");
	  }
		
		
		
		
	}
	
	
	
	
	

}
