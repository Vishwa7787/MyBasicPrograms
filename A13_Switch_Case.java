package myAssignments;
import java.util.Scanner;
public class A13_Switch_Case
{public static void main(String[] args) 
	{   Scanner s1= new Scanner(System.in);
		int num;
		System.out.println("Please Enter The Number Of The Day In A Week");
		num=s1.nextInt();
		switch(num)
		{
		case 1: System.out.println("Sunday");
	            break;
		    
	    case 2: System.out.println("Monday");
	            break;	
	            
	    case 3: System.out.println("Tuesday");
	            break;
	            
	    case 4: System.out.println("Wednesday");
                break;
		
	    case 5: System.out.println("Thursday");
                break;
		
	    case 6: System.out.println("Friday");
                break;
		
	    case 7: System.out.println("Saturday");
                break;
                
	    default:System.out.println("Entered The Wrong Number Of Day !! PLease Enter From 1-7");
		}
                
	
		
	}
		
		
		
	}
	
	
	
	
	
	
	


