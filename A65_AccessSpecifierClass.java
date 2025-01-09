package myAssignments;
 class Vishwaradhya
{
	static void add()
	{
System.out.println("Default Or Package Access Specifier for Class Is Working");
	}
}
public class A65_AccessSpecifierClass extends Vishwaradhya
{

	public static void main(String[] args) 
	{
System.out.println("Public Access Specifier for class Is Working");
		System.out.println();
		add();
	}
}


