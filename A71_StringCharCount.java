package myAssignments;

public class A71_StringCharCount 
{
	public static void main(String[] args) {
		
	int count=0;
	String  name="Lionel Messi LM10";
	char[] check=name.toCharArray();
	for(int i=0;i<check.length;i++)
	{
		count++;
	}
System.out.println("The Number Of Characters In the Given String Are As Below...");
System.out.println(count);	
	
	}

}
