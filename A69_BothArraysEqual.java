package myAssignments;

import java.util.Arrays;

public class A69_BothArraysEqual
{
	public static void main(String[] args) {

	int []a1=new int[3];
	a1[0]=34;
	a1[1]=45;
	a1[2]=56;	
	System.out.println(Arrays.toString(a1));
	
	int []a2=new int[3];
	a2[0]=34;
	a2[1]=45;
	a2[2]=56;	
	System.out.println(Arrays.toString(a2));
	
	boolean condition = Arrays.equals(a1, a2);
	if(condition==true)
	{   System.out.println("......................");
		System.out.println("Yes The Both Arrays Are Equals To Each Other");
	}
	
}

}
