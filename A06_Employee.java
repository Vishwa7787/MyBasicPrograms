package myAssignments;

public class A06_Employee
{
	A06_Employee(String a)
	{
		System.out.println("Employee Name :- Vishwaradhya");
	}
	A06_Employee(int a)
	{
		System.out.println("Employee ID:- 10709090");
	}
	A06_Employee(String a,int b)
	{
		System.out.println("Employee Company:- Capegemini");
	}
	A06_Employee(String a1,int b1,int c)
	{
		System.out.println("Employee Designation:- Senior Quality Analyst");
	}
	A06_Employee(double a)
	{
		System.out.println("Employee Salary:- 900000 PA");
	}
	public static void main(String[] args)
	{
	new A06_Employee("Vishwaradhya");
	new A06_Employee(10709090);
	new A06_Employee("Capegemini",10);
	new A06_Employee("Senior Quality Analyst",10,20);
	new A06_Employee(900000.09);

	}

}
