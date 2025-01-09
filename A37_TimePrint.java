package myAssignments;

import java.util.Date;

public class A37_TimePrint 
{  
	public static void main(String[] args) 
	{   
		Date d1=new Date();
		System.out.println(d1.getTime());
		
		Date d2=new Date(d1.getTime());
		System.out.println(d2);
		String extract = d2.toString();
System.out.println("This is The Exact Print Time = "+extract.substring(0, 3).concat(", ")+extract.substring(4, 10));
		
		
	}

}
