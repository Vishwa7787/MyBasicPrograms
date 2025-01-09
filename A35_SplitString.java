package myAssignments;
import java.util.Arrays;
public class A35_SplitString 
{
	public static void main(String[] args) 
	{  String name="Java is fun";               //i
       String [] s1=name.split(" ");
       System.out.println(Arrays.toString(s1));
       
       String name1="Python Java C++";           //ii
       String [] s2=name1.split(" ",2);          
       System.out.println(Arrays.toString(s2));
		
		String name2="Java is fun to Learn";     //iii
		String [] s3=name2.split(" ", 3);
		System.out.println(Arrays.toString(s3));
		
		String sen="The Wolf Of Winterfell is The Jon Snow";
		String []s4=sen.split(" ");
		System.out.println(Arrays.toString(s4));  //iv
		System.out.println("The Number of Words in the String are == "+s4.length);
		
	}
	
	
	
	
	
	
	
	
	
	
	

}
