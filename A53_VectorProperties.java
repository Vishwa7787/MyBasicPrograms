package myAssignments;
import java.util.Vector;

public class A53_VectorProperties 
{ public static void main(String[] args) 
  {
	Vector<String>v1 = new Vector<String>();
	v1.add("Robbert");
	v1.add("Stannis");
	v1.add("Joffery");
	v1.add("Sersie");
	System.out.println(v1);
	v1.addElement("Barratheon");          //1
 	System.out.println(v1);
	System.out.println(v1.firstElement());//2
	System.out.println(v1.lastElement()); //3
    System.out.println(v1.removeElement("Barratheon"));//4
    System.out.println(v1);
    v1.removeElementAt(3);                //5
    System.out.println(v1);
    v1.removeAllElements();               //6
	System.out.println(v1);
	System.out.println(v1.capacity());    //7
	
  }

}
