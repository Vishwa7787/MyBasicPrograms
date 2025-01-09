package myAssignments;
class Gulbarga                     //Test Case 1   //Parent Class
{
    void t1()
	{
		System.out.println("Transportation Through KSRTC");
	}
}
class Bangaluru extends Gulbarga  // Test Case 2
{
    void t2()
	{
		System.out.println("Transportation Through VRL");
	}
}
class Tumkuru extends Gulbarga     //Test Case 3
{
	void t3()
	{
		System.out.println("Transportation Through Train");
	}
}
public class A20_HierarchicalTransportation
{
  static void transport()
   {
	   System.out.println("Transportation Of Goods Of X Company");
   }
	public static void main(String[] args)
	{
		transport();
		Bangaluru b1=new Bangaluru();
		Tumkuru t1=new Tumkuru();
		b1.t1();
		b1.t2();
		t1.t3();
	
	}
 
}

