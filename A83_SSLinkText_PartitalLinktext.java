package myAssignments;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class A83_SSLinkText_PartitalLinktext 
{
public static void main(String[] args) throws InterruptedException 
{
	ChromeDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.amazon.in");
	WebElement e1 = driver.findElement(By.linkText("Customer Service"));  //BY LinkText
	e1.click();
	Thread.sleep(2000);
    driver.navigate().back();
	WebElement e2 = driver.findElement(By.partialLinkText("Custom"));  //BY Partial_LinkText
	e2.click();
	
}
}
