package learning.programs;

public class Nested_If_Else
{  
	public static void main(String[] args)
	{
		byte age=20;
		short salary=10000;
		
		if(age>18)
		{
			
			if(salary<9000)
			{
				System.out.println("you can't buy a car");
			}
			
			else
			{
			      System.out.println("you can buy a new car"); 
		    }
		
	    }
	    else 
	  	{
		      System.out.println("you are not allowed to buy a car");
	    }
		
	}

}
