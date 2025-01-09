package myAssignments;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class A96_FindoutBrokenLinksFlipkart 
{
   public static void main(String[] args) throws IOException
   {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().minimize();
		driver.get("https://www.flipkart.com/");
        List<WebElement> elements = driver.findElements(By.tagName("a"));
        int count=elements.size();
        System.out.println(count);
        
        for(int i=0;i<count;i++)
        {
        	WebElement all = elements.get(i);
			String links = all.getAttribute("href");
        	System.out.println(links);
        	verifylink(links);
        }
       
   }
   
   static void verifylink(String links) throws IOException
   {
	 try
	 {
      URL u1= new URL(links);
	  HttpURLConnection u2= (HttpURLConnection)u1.openConnection();
	  if(u2.getResponseCode()==200)
	  {
		  System.out.println("Valid Link");
		  System.out.println("The Response Code Is :-> "+u2.getResponseCode());
		  System.out.println("The Response Message Is :-> "+u2.getResponseMessage());
		  
	  }
	  else
	  {
		  System.out.println("INVALID Link");
		  System.out.println("The Response Code Is :-> "+u2.getResponseCode());
		  System.out.println("The Response Message Is :-> "+u2.getResponseMessage());
		  
	  }
	  
	 }
	 catch(ClassCastException c1)
	 {
		 System.out.println("There Was A Problem Working on The Link");
	 }
   }

}
