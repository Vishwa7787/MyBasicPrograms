package co_Ordinator_Pckg;

public class Assignment_58_CoOrdinator
{
	public Assignment_58_CoOrdinator()
	{
		System.out.println("This The Public Access Specifiers Constructor");
	}
	private Assignment_58_CoOrdinator(int a)
	{    
		System.out.println("This The Private Access Specifiers Constructor");
	}
	protected Assignment_58_CoOrdinator(int a,int b)
	{    
		System.out.println("This The Protected Access Specifiers Constructor");
	}
     Assignment_58_CoOrdinator(String a)
	{   
		System.out.println("This The Default Access Specifiers Constructor");
	}
   	
}
