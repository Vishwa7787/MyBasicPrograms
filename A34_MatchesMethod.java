package myAssignments;
public class A34_MatchesMethod 
{
	public static void main(String[] args) 
	{
		String name="myJava";
	    boolean b= name.matches("......");  //Checking If The String Contains Exact 6 letters
	    if(b==true)
	    {
	    	System.out.println("Yes The Given String Contains Exact 6 Letters>> "+b);
	    }
	    boolean b1=name.matches("m(.*)");
	    if(b1==true)
	    {
	    	System.out.println("Yes The Given String Starts with 'm' >>         "+b1);
	    }
	    boolean b2=name.matches("(.*)y");
	    if(b2==true)
	    {
	    	System.out.println("Yes The Given String Ends with 'y' >>  "+b2);
	    }
	    else
	    {
	    	System.out.println("NO The Given String NOT Ends with 'y' >>        "+b2);

	    }
	    
	       
		
	}

}
