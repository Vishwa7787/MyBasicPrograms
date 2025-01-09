package learning.programs;
public class Country_India
{
	 Country_India(int a)
	{
		System.out.println("I Live In India");
	}
	 Country_India(double a)
	 {
		 System.out.println("I Live In Japan");
	 }
	

	public static void main(String[] args)
	{
		System.out.println("Main method");
	    new Country_India(2000);  // creating an object in other way
	    new Country_India(2.32); 
		    
	}
	

}
