package learning.programs;

public class Local_Global_Varaible
{
	int age=90;
	static double salary=90087.87;
	
	    public static void main(String[] args) 
        {
	       salary=27328.26;
	       System.out.println(salary);
	       Local_Global_Varaible rev =new Local_Global_Varaible();
	       System.out.println(rev.age);
	  
        }
}
