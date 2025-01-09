package learning.programs;

public class ThisKyeword_Learning 
{
	int age;
	String name;
	double salary;
	void student_details(int age,String name,double salary)
	{
		this.age=age;//local to global 
		this.salary=salary;
		this.name=name;
	}
public static void main(String[] args) 
{
	ThisKyeword_Learning t1=new ThisKyeword_Learning ();
	t1.student_details(25, "Ram",87654);
	System.out.println(t1.salary);
	System.out.println(t1.name);
	System.out.println(t1.age);
}	
	
	//This KeyWord in JAva Is Used To Assign The Value Of Local Value To Global Variable




}
