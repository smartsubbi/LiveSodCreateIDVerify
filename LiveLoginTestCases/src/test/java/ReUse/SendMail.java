package ReUse;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class SendMail 
{
	static WebDriver driver;
	
	@Test
	public static void sendMail(String userName, String password, String emailAddress, String authorisedOrNot) throws Exception
	{
		
		String email = System.getProperty("emailid");
		
		driver = new FirefoxDriver();
		
		driver.get("https://mail.google.com/");
		
		Thread.sleep(5000);
		
		driver.findElement(By.id("Email")).sendKeys("seleniumsubbu");
		
		Thread.sleep(5000);
		
		driver.findElement(By.id("next")).click();
		
		Thread.sleep(5000);
		
		driver.findElement(By.id("Passwd")).sendKeys("blademaster1");
		
		Thread.sleep(5000);
		
		driver.findElement(By.id("signIn")).click();
		
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//div[.='COMPOSE']")).click();
		
		Thread.sleep(5000);
		
		driver.findElement(By.id(":na")).sendKeys(email);
				
		Thread.sleep(5000);
		
		driver.findElement(By.id(":mu")).sendKeys("SOD Live ID Created");
		
		Thread.sleep(5000);		
		
		String content = "UserName is : "+userName+"\nPassword is : "+password+"\nEmailId is : "+emailAddress+"\nAuthorised : "+authorisedOrNot;
		
		driver.findElement(By.id(":nz")).sendKeys(content);
		
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//div[.='Send']")).click();
		
		Thread.sleep(5000);
		
		driver.close();
		driver.quit();		
	}
}
