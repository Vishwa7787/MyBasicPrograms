package myAssignments;

public class A73_ThisKeyword 
{
	String name;
	int age;
	double weight;
	void person_details(String name,int age,double weight)
	{
		this.name=name;
		this.age=age;
		this.weight=weight;
		System.out.println("Any Person Details");
		//This Keyword to assign value from local variable to global
		//Only Be Used In The Non-Static Context
		}
	public static void main(String[] args) {
		A73_ThisKeyword t1=new A73_ThisKeyword();
		t1.person_details("Basavaraj", 30, 70.50);
		System.out.println(t1.name);
		System.out.println(t1.age);
		System.out.println(t1.weight);
		
	}


}
