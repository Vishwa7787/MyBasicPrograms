package myAssignments;
import java.util.Scanner;
interface vishwa
{
	void add();
	void sub();
}
public class A66_AccessSpecifierInterface implements vishwa
{
	public static void main(String[] args) {
		A66_AccessSpecifierInterface a1=new A66_AccessSpecifierInterface();
		a1.add();
        a1.sub();
}

	public void add() {
		System.out.println(" Public Access Specifier for Interface");
	}
	public void sub() {
		System.out.println(" Package/default Access Specifier For Interface");
		
	}
	}
