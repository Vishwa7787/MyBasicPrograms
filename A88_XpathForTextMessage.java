package myAssignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class A88_XpathForTextMessage
{
	public static void main(String[] args)
	{
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
	    driver.manage().window().maximize();
	    WebElement e1 = driver.findElement(By.xpath("(//span[.='Sign in'])[1]"));
	    e1.click();
	   
	}

}
