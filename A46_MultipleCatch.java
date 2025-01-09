package myAssignments;

import java.util.InputMismatchException;
import java.util.Scanner;

public class A46_MultipleCatch 
{
	public static void main(String[] args) {
		try
		{
	Scanner s1=new Scanner(System.in);
 System.out.println("Write a Expression for Dividing Number");
 int ar=s1.nextInt()/s1.nextInt();
 System.out.println("Here Your Answer Is>>"+ar);
		}
   catch(InputMismatchException i1){
	Scanner s2=new Scanner(System.in);
	System.out.println("Write an Arithmetic Expretion By Numerics");
	 int ar=s2.nextInt()/s2.nextInt();
	 System.out.println("Here Your Answer Is>>"+ar);
    }
catch(ArithmeticException a1) {
  Scanner s3=new Scanner(System.in);
  System.out.println("You Have Entered A Wrong Arithmetic Expression");
  System.out.println("Do Once Again");
  int ar=s3.nextInt()/s3.nextInt();
  System.out.println("Here Your Answer Is>>"+ar);
  
  
  }
		

}

}
