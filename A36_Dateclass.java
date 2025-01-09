package myAssignments;
import java.util.Date;
public class A36_Dateclass 
{
  public static void main(String[] args) 
  {
	  Date d1=new Date();
	  System.out.println(d1.getTime());                          //Current Time                          
	  String time3=d1.toString();
	  String Day2= time3.substring(0, 3);
	  String Month2= time3.substring(4, 7);
	  String Date2=time3.substring(8, 10);
	  String t=time3.substring(11, 20);
	  String format3=Day2.concat(",").concat(Month2).concat(" ").concat(Date2).concat(" ").concat(t);
	  System.out.println("This Is The Current Time =    "+format3);
	  
	  Date d2=new Date(d1.getTime()+(1000*60*60*24*1));
	  System.out.println(d2);                                   //Future Time
	  String time1=d2.toString();
	  String Day = time1.substring(0, 3);
	  String Month= time1.substring(4, 7);
	  String Date=time1.substring(8, 10);
	  String t1=time3.substring(11, 20);
	  String format=Day.concat(",").concat(Month).concat(" ").concat(Date).concat(" ").concat(t1);
	  System.out.println("This Is The Future Time =     "+format);
	  
	  Date d3=new Date(d1.getTime()-(1000*60*60*24*1));
	  System.out.println(d3);                                   //Past Time
	  String time2=d3.toString();
	  String Day1 = time2.substring(0, 3);
	  String Month1= time2.substring(4, 7);
	  String Date1=time2.substring(8, 10);
	  String t2=time3.substring(11, 20);
	  String format1=Day1.concat(",").concat(Month1).concat(" ").concat(Date1).concat(" ").concat(t2);
	  System.out.println("This Is The Past Time   =     "+format1);
	
  }
	
	
	
	
	
	
	
	
	
	
}
