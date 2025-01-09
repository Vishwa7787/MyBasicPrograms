package myAssignments;
import java.util.Arrays;
public class A68_ArraysInputCheck
{
	public static void main(String[] args) 
	{
		int age[]=new int[5];
		age[0]=89;
		age[1]=67;
		age[2]=34;
		age[3]=21;
		age[4]=54;
		System.out.println(Arrays.toString(age));
		int find=34;
		int index=0;
		for(int i=0;i<age.length;i++)
		{
		if(find==34)
		{
			
		}
		if(age[i]==34)
	     {
			index=i;
	     }
		}
System.out.println("Yes The Given Value 34 is Present in The Arrays");
System.out.println("The Index Of Given Value 34 is: "+index);
	}

}
