package myAssignments;

import java.util.InputMismatchException;
public class A52_Throw_Throws 
{
	
	public static void main(String[] args) throws NullPointerException, ArithmeticException {
		if(2>6)
		{
			throw new NullPointerException("Sorry There Is No file Here");
		}
		else
		{
			throw new ArithmeticException("Hey Please Check The Number you Have Entered");
		}
	
		
	}

}
