package myAssignments;
final class keyword
{  //final class cannot be inherited
	final void add()
	{
		System.out.println("I'm Final Method");
	}
	//final method cannot be overridden
}
public class A75_FinalKeyword  
{ 
	
	//final variable should be initialized when declared
	final static double pi=3.14;;
    static void sub()
    {
    //	pi=2.13;
    //final variable cannot be changed when declared
    }
 
 public static void main(String[] args)
 {
	 A75_FinalKeyword a1=new A75_FinalKeyword();
	 
	System.out.println(pi);
	
 }

}
