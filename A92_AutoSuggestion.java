package myAssignments;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class A92_AutoSuggestion 
{
public static void main(String[] args) throws InterruptedException 
{
	ChromeDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.amazon.in/");
	WebElement search = driver.findElement(By.id("twotabsearchtextbox"));
	search.sendKeys("Purse");
	Thread.sleep(2000);
	List<WebElement> list = driver.findElements(By.xpath("//div[@class='two-pane-results-container']/div/div"));
    list.get(2).click();
	
	
}
}
