package myAssignments;
import java.util.List;

import org.jspecify.annotations.Nullable;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class A90_FindNumberOfLinks 
{
public static void main(String[] args)
{
	ChromeDriver driver = new ChromeDriver();
	driver.manage().window().minimize();
	driver.get("https://www.flipkart.com/");
	List<WebElement> links = driver.findElements(By.tagName("a"));
	int count = links.size();
	System.out.println(count);
	
	for(int i=0;i<count;i++)
	{
	WebElement link_0 = links.get(i);
	String alllinks = link_0.getAttribute("href");
	System.out.println(alllinks);
	}
	
}
}
