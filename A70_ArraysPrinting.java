package myAssignments;
public class A70_ArraysPrinting
{
	public static void main(String[] args) {
		int i1=0;
	String [] s=new String[3];
	s[0]="John";
	s[1]="Sansa";
	s[2]="Arya";
System.out.println("Printing Using For Loop >>>");
	for(int i=0;i<s.length;i++)
	{
		System.out.println(s[i]);
	}
	System.out.println("..........");
System.out.println("Printing Using For Each Loop >>>");
	for(String i: s)
	{
		System.out.println(i);
	}
	System.out.println("..........");
System.out.println("Printing Using Print Statements>>>");
   System.out.println(s[0]+" "+s[1]+" "+s[2]);
   System.out.println("..........");
System.out.println("Printing Using While Statements>>>");
    while(i1<s.length)
    {
	   System.out.println(s[i1]);
	   i1++;
    }
   
		
		
		
		
	}

}
