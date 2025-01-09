package myAssignments;

public class A79_ByteToLong 
{
	public static void main(String[] args) 
	{
		byte a=10;
		System.out.println("Byte Value="+a);
		  
		long l=a;         //widening
		System.out.println(l);
		l=876968;
		System.out.println("Converting Byte To Long Done With Implicit Manner");
		System.out.println(l);
		
		
		System.out.println("_________");
		
		byte a1=30;
		System.out.println("Byte a1 Value="+a1);
		long b=(long)a1;  //Widening
		b=927732;
		System.out.println("Converting Byte To Long Done With Explicit Manner");
		System.out.println(b);
		
	}

}
