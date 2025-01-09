package myAssignments;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class A48_ListReverse
{
	public static void main(String[] args) {
		
		List <String>l1 = new ArrayList<String>();
		l1.add("Vishwaradhya");
		l1.add("Shanmukhayya");
		l1.add("Jewargi");
		System.out.println("Original List: "+l1);
		System.out.println("....................");
		
		Collections.reverse(l1);
		System.out.println("Reversed List: "+l1);
		System.out.println("....................");
		
		List <String>rev= new ArrayList<>();
		for(String word: l1)
		{
			rev.add(new StringBuffer(word).reverse().toString());
		}
		System.out.println("Reversed Words in List: "+rev);
		
		

		
		
	}
	
	
	
	

}
