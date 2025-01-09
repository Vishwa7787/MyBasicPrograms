package myAssignments;
class Vehicle
{
	Vehicle(int a)
	{   int sum=a;
		System.out.println("Parameterized "+sum+ " Wheeler Vehicle");
	}
}
public class A18_SuperCar extends Vehicle
{
	A18_SuperCar()
	{   super(4);
		System.out.println("The Car Name Is Toyota Fortuner");
	}
	
  public static void main(String[] args) 
  {
	  new A18_SuperCar();
	  System.out.println("Achieved Super Calling Statement");
	
  }
}
