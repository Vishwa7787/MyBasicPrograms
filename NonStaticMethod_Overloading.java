package learning.programs;

public class NonStaticMethod_Overloading 
{
   void add(double a)
   {
	   double sum = 6+a;
	   System.out.println(sum);
   }
   void add(int a)
   {
	   int sum = a+6;
	   System.out.println(sum);
   }
	
	public static void main(String[] args) 
     {
		NonStaticMethod_Overloading n1 = new NonStaticMethod_Overloading();
		n1.add(90);
		n1.add(3.76);
     }
	
	
	
	
	
}
