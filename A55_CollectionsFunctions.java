package myAssignments;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class A55_CollectionsFunctions
{
	public static void main(String[] args) {
	List<Integer>l1=new ArrayList<Integer>();
	l1.add(12);
	l1.add(34);
	l1.add(87);
	l1.add(22);
	l1.add(89);
	l1.add(56);
	List<Integer>l2=new ArrayList<Integer>(2);
	l2.add(200);
	l2.add(100);
	
	Collections.sort(l1); 
	System.out.println(l1);   //Sorted The List
	System.out.println("Maximum Value of List:>>> "+Collections.max(l1));    //Maximum Value
	System.out.println("Minimum Value of List:>>> "+Collections.min(l1));	//Minimum Value
	Collections.reverse(l1);
	System.out.println("Reversed List:>>>> "+l1);                     //Reversed The List
    Collections.shuffle(l1);
    System.out.println("Shuffled List:>>>> "+l1);
    Collections.swap(l1, 0, 5);
    System.out.println("Swapped List:>>>>> "+l1);
    Collections.rotate(l1, 3);
    System.out.println("Rotated List:>>>>> "+l1);
    System.out.println("The Frequency of L1 And L2:>>  "+Collections.frequency(l1, l2));
    System.out.println("No Elements in Common So:    "+Collections.disjoint(l1, l2));
    Collections.replaceAll(l2, 200, 2000);
    System.out.println("Replaced Old Value With New: "+l2);

		
		
		
	}

}
