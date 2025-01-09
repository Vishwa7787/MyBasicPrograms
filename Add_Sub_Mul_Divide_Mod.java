package learning.programs;

public class Add_Sub_Mul_Divide_Mod 
{
	 static void add()
	 {
		 int no1=10;
	     int no2=20;
	     int sum=no1+no2;
	     
	     System.out.println(sum);
	 }
	 
	 static void sub()
	 {
		 int no1=10;
	     int no2=20;
		 int subtraction=no2-no1;
		 
		 System.out.println(subtraction);
	 }
	 
	 static void mul()
	 {
		 int no1=10;
		 int no2=20;
		 int multiplication=no1*no2;
		  
		 System.out.println(multiplication);
		 
	 }
	
	static void div()
	{
		int no1=10;
		int no2=20;
		int division=no2/no1;
		
		System.out.println(division);
		
	}
	
     static void mod()
     {
    	 int no1=10;
    	 int no2=20;
    	 int modulus=no2%no1;
    	 
    	 System.out.println(modulus);
    	 
     }
     public static void main(String[] args)
     {
    	 add();
    	 sub();
    	 mul();
    	 div();
    	 mod();
    	 
	}
}
