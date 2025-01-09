package learning.programs;
public class Assignment_01 
{
	public static void main(String[] args)
	{
		int delhi=50;
		int pune =30;
		int goa = 20;
		
		 if(goa>delhi)
		   {
			    System.out.println("goa is biggest city");
		   }
		 else if(pune<goa)
		   {
			    System.out.println("pune is samller city");
		   }
	     else if(delhi<=goa)
		    {
		    	System.out.println("delhi is smaller city");
		    }
		 else if(pune>delhi)
		    {
		        System.out.println("pune is biggest city");
		    }
	     else if(delhi<=goa)
	        {
	    	    System.out.println("delhi is smaller city");
	        }
		 else 
	     {
	    	 System.out.println("delhi is the biggest city");
	     } 
	}
}
