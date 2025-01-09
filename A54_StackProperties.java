package myAssignments;
import java.util.Stack;
public class A54_StackProperties 
{
	public static void main(String[] args) {
	Stack<String> s1 = new Stack<String> ();
	s1.add("Vishwa");
	s1.add("Ananthkrishna");
	s1.add("Sandeep");
	s1.add("Manikanth");
	s1.add("Siddaraya");
	System.out.println(s1);
	s1.pop();                     //Removed The Last Value
	System.out.println("Removed The Last Value:....."+s1);
	s1.peek();       
	System.out.println("Fetching The Last Value:...."+s1.peek());//Fetched to Last Value
	
	s1.push("Shrishail");         //Added The Value
	System.out.println("Added The new Value:......."+s1);  
	
	
	
	
	
	
	
	
	}
}
