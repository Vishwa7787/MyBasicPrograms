package myAssignments;

public class A12_UsageOfVariables
{   
	static String global="I Am The Golbal Variable"; //global Variable
    static int a=200;
    static int b=300;

	static void add()
	{   a=50;  
	    a=60;
	    System.out.println("Actual Static Global Variable "+a);
	//Updating The Value Of Global Variable In Static Way
		String local="I Am The Local Variable"; //local variable
	    local="Actual Static Local Variable";
		System.out.println(local);
	}
	public static void main(String[] args)
	{
		add();
		A12_UsageOfVariables s1=new A12_UsageOfVariables();
System.out.println("Actual Non-Static Global Variable "+ (s1.b=100));//Updating The Value Of Global Variable In Non-Static Way
      final int a=100;    //Final Variable, it Cannot Be Changed, Its Fixed
      int sum1=a+900;
      System.out.println("Actual Final Variable " + sum1);
      
	}
	
	
	
}
