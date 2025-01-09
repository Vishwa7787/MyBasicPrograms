package myAssignments;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class A95_XpathForProductsApollo 
{
 public static void main(String[] args) throws InterruptedException 
 {
	ChromeDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.apollopharmacy.in/");
	driver.findElement(By.xpath("(//div[@id='mainContainerCT']/div)[1]/div/div/div/div")).click();
	driver.findElement(By.xpath("//input[@id='searchProduct']")).sendKeys("Paracetamol");
	Thread.sleep(3000);
	List<WebElement> list = driver.findElements(By.xpath("//div[@class='MedicineAutoSearch_searchList___m_g7 null']/ul/li"));
    System.out.println(list.size());
    list.get(0).click();
    
	
	
}
}
