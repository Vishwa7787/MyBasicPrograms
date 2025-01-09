package myAssignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
public class A85_SS_XpathJSAM 
{
  public static void main(String[] args) 
  {
	ChromeDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("file:///C:/Users/DELL/OneDrive/Pictures/Screenshots/grotechminds.html");
	WebElement username = driver.findElement(By.xpath("(/html/body/input)[1]"));
	username.sendKeys("Vishwa@1234");
	WebElement hint= driver.findElement(By.xpath("(/html/body/input)[2]"));
    hint.sendKeys("XYZ");
    WebElement pass= driver.findElement(By.xpath("(/html/body/input)[3]"));
    pass.sendKeys("www.passskey.sent");
    WebElement fname= driver.findElement(By.xpath("(/html/body/form/input)[1]"));
    fname.sendKeys("Vishwaradhya");
    WebElement cbox1= driver.findElement(By.xpath("((/html/body/form)[2]/input)[1]"));
    cbox1.click();
    WebElement radio= driver.findElement(By.xpath("(/html/body/input)[4]"));
    radio.click();
    WebElement radio1= driver.findElement(By.xpath("(/html/body/input)[6]"));
    radio1.click();
    WebElement select= driver.findElement(By.xpath("/html/body/select"));
    Select s1 = new Select(select);
    s1.selectByValue("Hindu");
    WebElement signup= driver.findElement(By.xpath("(/html/body/input)[7]"));
    signup.click();
    	
	
  }
}
