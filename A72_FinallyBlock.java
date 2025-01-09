package myAssignments;

public class A72_FinallyBlock
{
	public static void main(String[] args) {
		try
		{
				int a=1; int b=0;
				int div=a/b; System.out.println(div);
				
		}
		catch(ArithmeticException a1)
		{
			System.out.println("hey there was a wrong arithmetic expression please check");int a=1; int b=1;
			int div=a/b; System.out.println(div);
			
		}
		finally
		{
		System.out.println("Finally Block"+"either try or catch will not execute, but I Always Excecute ");
	    System.out.println("for closing the application or software");
		}
		
		
		
	}


}
