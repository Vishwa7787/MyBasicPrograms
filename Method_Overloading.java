package learning.programs;

public class Method_Overloading
{
	
	static void add(int a)// 1 parameters
	{
		int sum=a+6;
		System.out.println(sum);
				
	}
	static void add(int a,int b)//2 parameters
	{
		int sum=a+b+6;
				System.out.println(sum);
		
	}
	static void add(double a)
	{
		double sum=a+6;
		System.out.println(sum);
	}
	
	static void add(int a,double b,double c)
	{
		double sum= a+b+c+6;
		System.out.println(sum);
	}
	public static void main(String[] args)
	{
      add(100);	
	  add(100,200);
	  add(5.987);
	  add(11,34.32,13.45);
	  
		
		
	}
	
	
	
	

}
