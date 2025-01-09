package myAssignments;

public class A19_ThisCalling_Employe
{

	A19_ThisCalling_Employe(String name,int icard)
	{
		String nam=name;
		int id=icard;
		System.out.println("Employe Name is         "+ nam);
		System.out.println("Employe Id Number is    "+id);
	}
	
	A19_ThisCalling_Employe(String designation,double salary)
	{this("Manjunath",1070948);
		String des=designation;
		double sal=salary;
		System.out.println("Employe Designation is  "+des );
		System.out.println("Employe Salary is       "+sal );
	}
	
	public static void main(String[] args)
   {
A19_ThisCalling_Employe a1=new A19_ThisCalling_Employe("Sales Exicutive",60000.50);
	System.out.print("Achieved Constructor Chaining By "
			+ "This Calling Statement");
   }
}
