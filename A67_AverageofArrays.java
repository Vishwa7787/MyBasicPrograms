package myAssignments;
import java.util.Arrays;
public class A67_AverageofArrays 
{
	public static void main(String[] args)
	{
		int [] a=new int[5];
		a[0]=29;
		a[1]=45;
		a[2]=55;
		a[3]=35;
		a[4]=86;
		System.out.println(Arrays.toString(a));
		int sum=0;
		double average=0;
		for(int i=0;i<a.length;i++)
		{
			sum=sum+a[i];
		}
		System.out.println("Total Sum Of 5 Numbers is:  "+sum);
		average=sum/a.length;
		System.out.println("The Average of These Numbers is: "+average);
		
		
	}
}
