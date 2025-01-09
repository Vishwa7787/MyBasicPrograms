package myAssignments;

import java.util.Arrays;
import java.util.Scanner;

public class A44_ArrayWithScanner
{
	public static void main(String[] args) {
	Scanner s1=new Scanner(System.in);
	System.out.println("Please enter The Size of Array");
      int [] population=new int[s1.nextInt()];
    System.out.println("Please Enter The Values Of Arrays One By One");
      population[0]=s1.nextInt();
      population[1]=s1.nextInt();
      population[2]=s1.nextInt();
      population[3]=s1.nextInt();
      population[4]=s1.nextInt();
 
      System.out.println(Arrays.toString(population));
      
     for(int i=0;i<population.length;i++)
      {
    	  System.out.println(population[i]);
      }
      
      
	} 
}
