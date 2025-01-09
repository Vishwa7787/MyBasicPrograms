package myAssignments;

class Mysore
{
	void check()
	{
System.out.println("Jambu Savari Is Done In Mysore On Occasion of Dusshera");
	}
}

public class A16_SingleLevel_Inheritance extends Mysore
{   void check1()
	{
System.out.println("Abhimanyu Carried The Ambari This Year");
	}
	public static void main(String[] args)
	{
		A16_SingleLevel_Inheritance s1=new A16_SingleLevel_Inheritance();
		s1.check();
		s1.check1();
		System.out.println("We Achieved Single Level Inheritance Here!!");
	}


}
