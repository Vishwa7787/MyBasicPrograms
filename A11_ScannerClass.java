package myAssignments;
import java.util.Scanner;
public class A11_ScannerClass {
public static void main(String[] args){
	Scanner s1=new Scanner(System.in);
	System.out.println("Enter The Student Name");
	String name=s1.next();
	System.out.println("Enter The ID Number Of The Student");
	int id=s1.nextInt();
	System.out.println("Enter The College Name");
	String college=s1.next();
	System.out.println("Enter The Branch Name");
	String branch=s1.next();
	System.out.println("Enter The Phone Number");
	long mobile=s1.nextLong();
	System.out.println("Thank You For Filling The Form..!!");
	System.out.println("Your Name is "+ name);
	System.out.println("Your ID Number is "+ id);
	System.out.println("Your College Name is "+ college);
	System.out.println("Your branch is "+ branch);
	System.out.println("Your Mobile Number is "+ mobile);
	

	
}
	
}