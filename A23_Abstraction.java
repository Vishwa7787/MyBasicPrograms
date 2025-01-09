package myAssignments;
abstract class Student4
{
	abstract void add(); 
	abstract void sub();
	
	void mul()
	{
		int a=15;
		int b=2;
		int sum=a*b;
		System.out.println("Concrete Method 1>>"+sum);
	}
	
	void div()
	{
		int a=80;
		int b=2;
		int sum=a/b;
		System.out.println("Concrete Method 2>>"+sum);
	}
}
public class A23_Abstraction extends Student4
{
	void add()
	{
		int a=5;
		int b=5;
		int sum=a+b;
		System.out.println("Abstract Method 1>>"+sum);
	}

	void sub() 
	{
		int a=30;
		int b=10;
		int sum=a-b;
		System.out.println("Abstract Method 2>>"+sum);
	}
	
	public static void main(String[] args)
	{
		A23_Abstraction a1=new A23_Abstraction();
		a1.add();
		a1.sub();
		a1.mul();
		a1.div();
		
	}

}
