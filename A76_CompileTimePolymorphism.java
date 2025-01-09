package myAssignments;

public class A76_CompileTimePolymorphism
{
	void add(int a)
	{
		System.out.println("1st MethodOverloading"); //Example Of Compile Time Polymorphism
	}
	void add(double a)
	{
		System.out.println("2nd MethodOverloading"); //Example Of Compile Time Polymorphism
	}
	public static void main(String[] args) {
		A76_CompileTimePolymorphism a1=new A76_CompileTimePolymorphism();
		a1.add(40);
		a1.add(40.40);
        Math.random();                               //Example Of Compile Time Polymorphism
        System.out.println(Math.addExact(80, 20)); 
        System.out.println(Math.addExact(827839918, 897163077));        //Example Of Compile Time Polymorphism
        
        
	}
	
	
	
	
	

}
