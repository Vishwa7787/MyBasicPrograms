package myAssignments;

public class A07_MethodOverloading {
   
     void add(int a)
    {
   	  int c=a+10;
   	     System.out.println(c);
    }
     static void add(int a, int b)
     {
   	  int c=a+b;
	     System.out.println(c);
     }
     static void add(int a, double b)
     {
   	  double c=a+b;
	     System.out.println(c);    
     }
     static void add(String a)
     {
    	 String c=a+"Radhya";
    	 System.out.println(c);
     }
	public static void main(String[] args)
	{
		
        A07_MethodOverloading m1=new A07_MethodOverloading();
		m1.add(100);
		m1.add(100, 200);
		m1.add(100, 30.77);
		add("Vishwa");
	}

}
