package myAssignments;
class Karnataka
{
	static void karnataka()
	{
     String a="Karnataka State of Ministry";
     System.out.println("The Static Method 1 " +a);
	}
	static void ministry()
	{
	 String a="Ministry Of Child And Women Wellfare";
     System.out.println("The Static Method 2 " +a);
	}
	static void yojana()
	{
	 String a="Bhagyalaxmi Yojana";
     System.out.println("The Static Method 3 " +a);
	}
}
class Banglore extends Karnataka
{
	void bbmp()
	{
		String a="Bruhat Bangalore Mahanagara Palike";
		System.out.println("Non-Static Method 1 "+a);
	}
	void chief()
	{
		String a="Tushar Giri Nath-Cheif Commisioner of BBMP";
		System.out.println("Non-Static Method 2 "+a);
	}
	
}
public class A17_MultilevelInheritance extends Banglore
{
	public static void main(String[] args) 
	{
		karnataka();
		ministry();
		yojana();
		A17_MultilevelInheritance a1=new A17_MultilevelInheritance();
		a1.bbmp();
		a1.chief();
		
		
	}
	
}
