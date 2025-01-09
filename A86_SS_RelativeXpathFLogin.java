package myAssignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class A86_SS_RelativeXpathFLogin
{
	public static void main(String[] args)
    {
     ChromeDriver driver = new ChromeDriver();
     driver.manage().window().maximize();
     driver.get("https://www.facebook.com");
     WebElement name = driver.findElement(By.xpath(("//input[@id='email']")));
     name.sendKeys("vishwagmath@gmail.com");
     
     WebElement pass = driver.findElement(By.xpath(("//input[@id='pass']")));
     pass.sendKeys("xyz.passwords");
   
     WebElement login = driver.findElement(By.xpath(("//button")));
     login.click();
	}

}
