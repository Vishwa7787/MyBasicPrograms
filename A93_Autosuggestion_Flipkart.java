package myAssignments;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class A93_Autosuggestion_Flipkart 
{public static void main(String[] args) throws InterruptedException 
{

	ChromeDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.flipkart.com/");
	WebElement search = driver.findElement(By.className("Pke_EE"));
	search.sendKeys("Shoe");
	Thread.sleep(2000);
	List<WebElement> list = driver.findElements(By.xpath("//form[@class='_2rslOn header-form-search OpXDaO']/ul/li"));
	list.get(7).click();
}

}
