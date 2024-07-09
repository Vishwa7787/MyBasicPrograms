package co_Ordinator_Pckg;

public class Aissignment_53_54_CoOrdinator
{
    public  void add(){  
		String Name= "Alpha";
		System.out.println("public access Specifier results ="+ Name);
	}
	private  void sub(){  
		String Name1="Beta";
		System.out.println("private access Specifier results ="+ Name1);
	}
	protected void mul(){  
		String Name2="Gamma";
		System.out.println("protected access Specifier results ="+ Name2);
	}
    void div(){ 
		String Name3="Delta";
		System.out.println("default access Specifier results ="+ Name3);
	}
    public static void main(String[] args) 
    { Aissignment_53_54_CoOrdinator a1=new Aissignment_53_54_CoOrdinator();
       a1.add();
       a1.sub();
       a1.mul();
       a1.div();
		
	}
	
	
}
