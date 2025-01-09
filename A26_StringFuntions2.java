package myAssignments;

public class A26_StringFuntions2 
{  
    public static void main(String[] args) 
    {
      String a="Welcome India";  //indexing from char
System.out.println("Index of Given Character c is== "+(a.indexOf('c')));
      
      String a1="Programming";   //character from index 
System.out.println("Retrived Character at the Index 4 is== "+(a1.charAt(4)));
      
      String b="Hello,"; String b1="World"; //Concatenation 
System.out.println("Concatinated String is== "+(b.concat(b1)));
      
      String name="Welcome to Java Programming";
System.out.println("Extracting a Substring== "+name.substring(11));
      
    	
	}

}
