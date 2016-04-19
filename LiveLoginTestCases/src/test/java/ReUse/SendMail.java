package ReUse;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class SendMail 
{	
	@Test
	public static void sendMail(WebDriver driver,String userName, String password, String emailAddress, String authorisedOrNot) throws Exception
	{		
		String emailIdToSend = System.getProperty("emailid");		
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
		driver.findElement(By.id(":na")).sendKeys("subramanyakb@jumpstart.com");
		System.out.println(emailIdToSend);
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
	
	@Test
	public static void sendMailOnlyContent(WebDriver driver, String subject, String content) throws Exception
	{	
		String emailIdToSend = System.getProperty("emailid");		
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
		driver.findElement(By.id(":na")).sendKeys("subramanyakb@jumpstart.com");					
		Thread.sleep(5000);		
		driver.findElement(By.id(":mu")).sendKeys(subject);		
		Thread.sleep(5000);				
		driver.findElement(By.id(":nz")).sendKeys(content);		
		Thread.sleep(5000);		
		driver.findElement(By.xpath("//div[.='Send']")).click();		
		Thread.sleep(5000);		
		driver.close();
		driver.quit();		
	}
}
