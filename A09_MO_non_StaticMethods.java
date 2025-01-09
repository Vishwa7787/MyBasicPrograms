package myAssignments;

public class A09_MO_non_StaticMethods 
{
	void add(int a)
	{
		System.out.println("Non Static Method Overloading 1");
	}
	void add(int a,int b)
	{
		System.out.println("Non Static Method Overloading 2");
	}
	void add(String a)
	{
		System.out.println("Non Static Method Overloading 3");
	}
public static void main(String[] args)
{
	A09_MO_non_StaticMethods m1=new A09_MO_non_StaticMethods();
	m1.add(100);
	m1.add(100, 200);
	m1.add("StringValue");
	
}
	
	
	
	
	
}
