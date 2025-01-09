package myAssignments;

import java.util.Scanner;

public class Calculator
{
	
	public static void main(String[] args)
{ Scanner s1 = new Scanner(System.in);

	int sum=0;
	int value[]=new int[5];
	System.out.println("Enter The Values To get The Sum Of Those Numbers");
	for(int i=0;i<value.length;i++)
	{
		value[i]=s1.nextInt();
	}
	for(int i=0;i<value.length;i++)
	{
		sum=sum+value[i];
	}
	System.out.println("This Is The Sum Of All Entered Numbers: "+sum);
	
	
}

}
