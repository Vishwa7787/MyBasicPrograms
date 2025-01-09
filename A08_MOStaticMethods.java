package myAssignments;

public class A08_MOStaticMethods
{
	static void add(int a)
	{
		int c=a+100;
		System.out.println(c);
	}
	static void add(int a,int b)
	{
		int c=a-b;
		System.out.println(c);
	}
	static void add(int a,double b)
	{
		double c=a/b;
		System.out.println(c);
	}
	
public static void main(String[] args)
{
	add(100);
	add(200,100);
	add(100,9.11);

}
	
}
