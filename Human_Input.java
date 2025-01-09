package learning.programs;
import java.util.Scanner;

public class Human_Input 
{
	static Scanner s1=new Scanner(System.in);
	
	static void add()
	{
		System.out.println("print the value of a");
		int a= s1.nextInt();
		System.out.println("print the value of b");
		int b= s1.nextInt();
	    int sub=a+b;
		System.out.println("The Value Of a+b=" +sub);
	}
	static void sub()
	{
		System.out.println("print the value of a");
		int a= s1.nextInt();
		System.out.println("print the value of b");
		int b= s1.nextInt();
	    int Subtract=a-b;
		System.out.println("The Value Of a-b=" +Subtract);
	
	}
	static void mul()
	{
		System.out.println("print the value of a");
		int a= s1.nextInt();
		System.out.println("print the value of b");
		int b= s1.nextInt();
	    int Mul=a*b;
		System.out.println("The Value Of a*b=" +Mul);
		
		
	}
	static void div()
	{
		System.out.println("print the value of a");
		int a= s1.nextInt();
		System.out.println("print the value of b");
		int b= s1.nextInt();
	    int Div=a/b;
		System.out.println("The Value Of a/1b=" +Div);
	}
	static void mod()
	{
		System.out.println("print the value of a");
		int a= s1.nextInt();
		System.out.println("print the value of b");
		int b= s1.nextInt();
	    int Mod=a%b;
		System.out.println("The Value Of a%b=" +Mod);
		
		
	}
	public static void main(String[] args)
	{
		add();
		sub();
		mul();
		div();
		mod();
	}

}
