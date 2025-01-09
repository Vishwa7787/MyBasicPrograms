package myAssignments;
class Twitter
{
	private String email="Vishwagmath@gmail.com";
    public String getEmail()
    {
    	return email;
    }
    public void setEmail(String email)
    {
    	this.email=email;
    }
    private int pass=12345678;
    public int getPass()
    {
    	return pass;
    }
    public void setPass(int pass)
    {
    	this.pass=pass;
    }
}
public class A74_Encapsulation 
{
 public static void main(String[] args)
 {
	 Twitter t=new Twitter();
	 t.setEmail("Ghantimath@gmail.com");
	 System.out.println(t.getEmail());
	 t.setPass(87654321);
	 System.out.println(t.getPass());
	 
	 
 }
	
	
	
}
