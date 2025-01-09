package myAssignments;
class Admin
{
	static void AdminLogin(int a)
	{   int code=a;
		System.out.println("Login Through Admin "+code);
	}
}
class Teacher extends Admin
{
	static void TeacherLogin(String name)
	{
		String code1=name;
		System.out.println("Login Through Teacher "+code1);
	}
}
class Student extends Teacher
{
   static void StudentsLogin(double value)
   {
	double code2=value;
	System.out.println("Login Through Student "+code2);
   }
}
public class A21_User_Login_MO extends Student
{
     static void login()
    {
	System.out.println("Code Of User Login");
    }
     public static void main(String[] args)
     { 
     login();
     StudentsLogin(2);
     TeacherLogin("Done");
     AdminLogin(1);
     System.out.println("Achieved MO For Login Functionality");
     
	}
}

