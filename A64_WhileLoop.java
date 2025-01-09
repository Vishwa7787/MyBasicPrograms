package myAssignments;

public class A64_WhileLoop 
{
	 
	public static void main(String[] args) 
	{
		int natural=1;
		int sum=0;
		while(natural<=50)
		{
			sum =natural+sum;
			natural=natural+1;
		}
		
System.out.println("The Sum Of 50 Natural Numbers:  "+sum);

		
	}

}
