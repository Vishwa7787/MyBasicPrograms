package myAssignments;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class A47_Iterator
{
  public static void main(String[] args)
  {
	List li = new ArrayList();
	li.add("Goat");
	li.add("Buffalo");
	li.add("Monkey");
	li.add("Dog");
	li.add("Cat");
	System.out.println(li);
	li.remove(1);              //Remove Method
	Iterator itr = li.iterator();
	while(itr.hasNext())         //hasNext Method
	{
		System.out.println(itr.next());   //next Method
	}
	

  }
}
