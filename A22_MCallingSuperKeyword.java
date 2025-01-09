package myAssignments;

class Admin1
	{
		Admin1(int a)
		{   super();
		    int code=a;
			System.out.println("Login Through Admin "+code);
		}
	}
class Teacher1 extends Admin1
	{
		Teacher1(String name)
		{   super(10);
			String code1=name;
			System.out.println("Login Through Teacher "+code1);
		}
	}
class Student1 extends Teacher1
	{
	    Student1(double value)
	    {   super("MKT");
		    double code2=value;
		    System.out.println("Login Through Student "+code2);
	    }
	}
public class A22_MCallingSuperKeyword extends Student
	{
		 A22_MCallingSuperKeyword(int a,String b)
	      {  
		   System.out.println("Code Of User Login");
	      }
	  public static void main(String[] args)
      { 
	   A22_MCallingSuperKeyword a1=new A22_MCallingSuperKeyword(100,"Vishwa");
	   new Student1(10.09);
     }
	}

