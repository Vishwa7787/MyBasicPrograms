package learning.programs;
public class Constructor_Overloading
{
	

	Constructor_Overloading(int a)
	{
		System.out.println("int datatype");
		
	}
	Constructor_Overloading(boolean b)
	{
		System.out.println("boolean datatype");
	}
	Constructor_Overloading(char c)
	{
		System.out.println("char datatype");
	}
	Constructor_Overloading(String d)
	{
		System.out.println("String dataype");
	}
	
	public static void main(String[] args)
	{
		/*
		Constructor_Overloading c1=new Constructor_Overloading("automation testing");
		Constructor_Overloading c2=new Constructor_Overloading('A');
		Constructor_Overloading c3=new Constructor_Overloading(true);
		Constructor_Overloading c4=new Constructor_Overloading(11); 
		*/
		new Constructor_Overloading("automation testing");
		new Constructor_Overloading('A');
		new Constructor_Overloading(true);
		new Constructor_Overloading(11);
	}
	

}
