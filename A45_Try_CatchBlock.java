package myAssignments;
import java.util.InputMismatchException;
import java.util.Scanner;
public class A45_Try_CatchBlock
{
	public static void main(String[] args) 
	{ Scanner s1=new Scanner(System.in);
	try {
	  System.out.println("Please Enter Your Height");
	  double height=s1.nextDouble();
	}
	catch(InputMismatchException a1)
	{
Scanner s2=new Scanner(System.in);
System.out.println("Hey You Have Entered The Wrong Data");
System.out.println("For Height You Must Enter A Numeric Value");
    }
  Scanner s2=new Scanner(System.in);
  System.out.println("Enter Your Height Once Again");
  double h1=s2.nextDouble();
  System.out.println("Please Enter Your Age");
  int age=s2.nextInt();
	if(age>=18)
	{
	System.out.println("You can Join The Poice Training Academy");
	}
	else
	{
    System.out.println("Sry You Can't Join The PTA As Your Data is");
    System.out.println("Non-Considerable");
	}
			
	  
	
	
	
	
	
	
	
	
	
	
	
	
	
	
		
	}
	
	

}
