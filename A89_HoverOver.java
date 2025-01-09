package myAssignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class A89_HoverOver 
{
	public static void main(String[] args)
	{
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		WebElement electronics = driver.findElement(By.xpath("//span[.='Electronics']"));
		Actions a1=new Actions(driver);
		a1.moveToElement(electronics).perform();
		WebElement btSpeakers = driver.findElement(By.xpath("//a[.='Bluetooth Speakers']"));
		btSpeakers.click();
		
		
	}

}
