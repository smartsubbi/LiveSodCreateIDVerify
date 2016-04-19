package ReUse;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class AuthoriseMailMailinator 
{		
	public static void autoriseMail(String userName,WebDriver driver) throws Throwable
	{	
		driver.findElement(By.id("inboxfield")).sendKeys(userName);		
		driver.findElement(By.xpath("//*[@class='input-group-btn']")).click();			
		Thread.sleep(5000);			
		driver.findElement(By.xpath("//*[@id='public_maildirdiv']/div/div")).click();		
		Thread.sleep(5000);		
		driver.switchTo().frame(driver.findElement(By.id("publicshowmaildivcontent")));		
		String bodyText = driver.findElement(By.xpath("/html/body/table/tbody/tr/td/table/tbody/tr[2]/td/table/tbody/tr/td[2]/table/tbody/tr[3]/td/p[2]/strong")).getText();		
		Assert.assertTrue(bodyText.contains(userName),"Text not found!");		
		String authorisationUrl = driver.findElement(By.xpath("//*[@rel='nofollow']")).getAttribute("href");
		driver.get(authorisationUrl);		
		Thread.sleep(5000);			
	}

}
