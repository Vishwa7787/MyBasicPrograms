package myAssignments;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class A94_Autosuggestion_YouTube
{
	public static void main(String[] args) throws InterruptedException 
	{
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.youtube.com/");
		WebElement search = driver.findElement(By.name("search_query"));
		search.sendKeys("india");
		Thread.sleep(5000);
		List<WebElement> list = driver.findElements(By.xpath("//div[@class='ytSuggestionComponentSuggestion ytSuggestionComponentSuggestionHover']"));
        System.out.println(list.size());
		list.get(0).click();
                
	}

}
