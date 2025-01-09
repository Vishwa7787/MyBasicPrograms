package myAssignments;
public class A77_2SIB_3IIB_2Obj 
{
	static
	{
		System.out.println("SIB_01");
	}
	static
	{
		System.out.println("SIB_02");
	}
	  {
		System.out.println("IIB_01");                            //IIB's Are Not The Methods its just IIB 
	  }
	    {
	    	System.out.println("IIB_02");
	    }
	      {
	    	  System.out.println("IIB_03");
	      }
	public static void main(String[] args)
	{
		System.out.println("Main Method");
		System.out.println("First Object Creation");
		new A77_2SIB_3IIB_2Obj();
		System.out.println("Second Object Creation");
		new A77_2SIB_3IIB_2Obj();
		
	}
}
