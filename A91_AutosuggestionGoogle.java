package myAssignments;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class A91_AutosuggestionGoogle 
{
	public static void main(String[] args) throws InterruptedException
{
	ChromeDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.google.com/");
	WebElement search = driver.findElement(By.id("APjFqb"));
	search.sendKeys("bangalore weather");
	Thread.sleep(2000);
	List<WebElement> list = driver.findElements(By.xpath("//div[@class='OBMEnb']/ul/li"));
	list.get(0).click();
	
	
}

}
