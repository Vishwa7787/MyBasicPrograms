package learning.programs;

import java.util.Arrays;

public class Anagram4 
{
	public static void main(String[] args) {
		String a="silent";
		String b="listen";
		char[] c1 = a.toCharArray();
		char[] c2 = b.toCharArray();
		Arrays.sort(c1);
		Arrays.sort(c2);
		System.out.println(Arrays.toString(c1));
		System.out.println(Arrays.toString(c2));
		boolean b1=Arrays.equals(c1, c2);
		if(b1==true)
		{
			System.out.println("Yes The Given String Is Anagram");
		}
		
	}

}
