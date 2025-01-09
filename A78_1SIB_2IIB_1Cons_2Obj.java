package myAssignments;

import java.util.Scanner;

public class A78_1SIB_2IIB_1Cons_2Obj 
{
	static 
	{
		System.out.println("SIB");
	}
	 {
		System.out.println("IIB_01");
	 }
	   {
		 System.out.println("IIB_02");
	   }
	A78_1SIB_2IIB_1Cons_2Obj()
	 {
		System.out.println("Constructor");
	 }
  public static void main(String[] args)
  {   System.out.println("First Object Creation");
      System.out.println("________________");
	  new A78_1SIB_2IIB_1Cons_2Obj();
	  System.out.println("  ");
	  System.out.println("Second Object Creation");
      System.out.println("________________");
	  new A78_1SIB_2IIB_1Cons_2Obj();
	  
  }
}
