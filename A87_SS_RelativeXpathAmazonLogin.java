package myAssignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class A87_SS_RelativeXpathAmazonLogin
{
public static void main(String[] args)
{
	ChromeDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.amazon.in/ap/signin?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.in%2F%3F%26tag%3Dgooghydrabk1-21%26ref%3Dnav_signin%26adgrpid%3D155259811873%26hvpone%3D%26hvptwo%3D%26hvadid%3D713930224764%26hvpos%3D%26hvnetw%3Dg%26hvrand%3D16210563084371733864%26hvqmt%3De%26hvdev%3Dc%26hvdvcmdl%3D%26hvlocint%3D%26hvlocphy%3D9062072%26hvtargid%3Dkwd-31596400%26hydadcr%3D5623_2441761%26gad_source%3D1&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0");
	WebElement username = driver.findElement(By.xpath("//input[@id='ap_email']"));
	username.sendKeys("vishwagmath@gmail.com");
	
	WebElement cont = driver.findElement(By.xpath("//input[@id='continue']"));
	cont.click();
	
	WebElement pass = driver.findElement(By.xpath("//input[@id='ap_password']"));
	pass.sendKeys("8971592916@Amazon.com");
	
	WebElement sign = driver.findElement(By.xpath("//input[@id='signInSubmit']"));
	sign.click();
	
}
}
