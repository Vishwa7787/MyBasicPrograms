package myAssignments;

import java.util.Arrays;

public class A62_SumofIntArrayForeach
{
	public static void main(String[] args)
	{
		int []a=new int[5];
		a[0]=13;
		a[1]=89;
		a[2]=34;
		a[3]=45;
		a[4]=21;
		System.out.println(Arrays.toString(a));
		int sum=0;
		for(int i:a)
		{
			sum+=i;
		}
		
		System.out.println("The Sum Of Arrays:  " +sum);

		
	}

}
