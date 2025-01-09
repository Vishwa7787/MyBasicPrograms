package myAssignments;
public class A02_5Methods 
{
	public static void add()
	{
		int a=10;
		int b=90;
		int add=a+b;
		System.out.println("1 Static Method Result = " + add);	
	}
	public static void sub()
	{
		int a=100;
		int b=10;
		int sub=a-b;
		System.out.println("2 Static Method Result = " + sub);	
	}
	public static void div()
	{
		int a=100;
		int b=10;
		int div=a/b;
		System.out.println("3 Static Method Result = " + div);	
	}
	public void mul()
	{
		int a=10;
		int b=20;
		int mul=a*b;
		System.out.println("1 non-Static Method Result = " + mul);	
	}
	public void mod()
	{
		int a=100;
		int b=20;
		int mod=a%b;
		System.out.println("2 non-Static Method Result = " + mod);	
	}
	public static void main(String[] args) 
	{	add();
		sub();
		div();
		A02_5Methods a1= new A02_5Methods();
		a1.mul();
		a1.mod();
	}
	
}
