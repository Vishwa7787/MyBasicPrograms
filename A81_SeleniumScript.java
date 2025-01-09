package myAssignments;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class A81_SeleniumScript 
{
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://grotechminds.com/registration/");
		Thread.sleep(2000);
        WebElement name = driver.findElement(By.id("fname"));
        name.sendKeys("Vishwaradhya");
        WebElement lname = driver.findElement(By.id("lname"));
        lname.sendKeys("Ghantimath");
        WebElement email = driver.findElement(By.id("email"));
        email.sendKeys("vishwagmath@gmail.com");
        WebElement pass = driver.findElement(By.id("password"));
        pass.sendKeys("xyz.passkey");
        WebElement padd = driver.findElement(By.id("Present-Address"));
        padd.sendKeys("Vidya Nagar, Jevargi, Kalaburgi, 585310");
        WebElement parmnt = driver.findElement(By.id("Permanent-Address"));
        parmnt.sendKeys("near Kedarlingayya house, Vidya Nagar, Jevargi, Kalaburgi, 585310");
        WebElement pinc = driver.findElement(By.id("Pincode"));
        pinc.sendKeys("585310");
      
	}

}
