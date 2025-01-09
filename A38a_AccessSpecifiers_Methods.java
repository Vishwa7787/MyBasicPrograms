package myAssignments;

public class A38a_AccessSpecifiers_Methods
{
	public static void add(){  
		int a=15; int b=15; int sum=a+b;
		System.out.println("public Access Specifier results ="+ sum);
	}
	private static void sub(){  
		int a1=15; int b1=15; int subtract=a1-b1;
		System.out.println("private Access Specifier results ="+ subtract);
	}
	protected static void mul(){  
		int a2=15; int b2=15; int multiply=a2*b2;
		System.out.println("protected Access Specifier results ="+ multiply);
	}
	static void div(){ 
		int a3=1000; int b3=30; int div=a3/b3;
		System.out.println("default Access Specifier results ="+ div);
	}

  public static void main(String[] args) 
  {
	  add();
	  sub();
	  mul();
	  div();
	  
	
  }
}
