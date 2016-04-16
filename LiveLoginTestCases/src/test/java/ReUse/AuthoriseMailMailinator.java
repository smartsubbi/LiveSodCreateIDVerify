package ReUse;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AuthoriseMailMailinator 
{	
	
	
	public static void autoriseMail(String userName,WebDriver driver)
	{
		
//		
//		
//		driver.get("http://mailinator.com");
		
		driver.findElement(By.id("inboxfield")).sendKeys(userName);
		
		driver.findElement(By.xpath("//*[@class='input-group-btn']")).click();
		
		
		
	
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
		
		driver.findElement(By.xpath("//*[@id='public_maildirdiv']/div/div")).click();
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
		
		driver.switchTo().frame(driver.findElement(By.id("publicshowmaildivcontent")));
		
		String bodyText = driver.findElement(By.xpath("/html/body/table/tbody/tr/td/table/tbody/tr[2]/td/table/tbody/tr/td[2]/table/tbody/tr[3]/td/p[2]/strong")).getText();
		System.out.println(bodyText);
		Assert.assertTrue(bodyText.contains(userName),"Text not found!");
		
		String authorisationUrl = driver.findElement(By.xpath("//*[@rel='nofollow']")).getAttribute("href");
		driver.get(authorisationUrl);	
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
		
//		String bodyText1 = driver.findElement(By.id("ctl00_mcp_lblParentEmail")).getText();
//		System.out.println(bodyText1);
//		Assert.assertTrue(bodyText1.contains(userName),"Text not found!");
//		
//		driver.findElement(By.id("ctl00_mcp_txtParentPassword")).sendKeys("123456");
//		
//		driver.findElement(By.id("ctl00_mcp_txtConfirmParentPassword")).sendKeys("123456");
//		
//		Select dropDown = new Select(driver.findElement(By.id("ctl00_mcp_ddlMonth")));
//		dropDown.selectByValue("6");
//		
//		try {
//			Thread.sleep(5000);
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}	
//		
//		Select dropDown1 = new Select(driver.findElement(By.id("ctl00_mcp_ddlDay")));
//		dropDown1.selectByValue("11");
//		
//		try {
//			Thread.sleep(5000);
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}	
//		
//		Select dropDown2 = new Select(driver.findElement(By.id("ctl00_mcp_ddlYear")));
//		dropDown2.selectByValue("1984");
//		
//		try {
//			Thread.sleep(5000);
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}	
//		
//		((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();", driver.findElement(By.xpath("/html/body/form/div[5]/div[2]/div/div[1]/div[3]/div/div/p[139]")));
//		
////		driver.findElement(By.xpath("/html/body/form/div[5]/div[2]/div/div[1]/div[3]/div/div/p[139]")).click();
//		
//		driver.findElement(By.id("ctl00_mcp_chkAgreeToTnC")).click();;
//		
//		try {
//			Thread.sleep(5000);
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}	
//		
//		driver.findElement(By.id("ctl00_mcp_btnUpdate")).click();
//		
//		try {
//			Thread.sleep(5000);
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		
//		String bodyText2 = driver.findElement(By.xpath("//div[@id='page']/div/div/div/h1")).getText();
//		System.out.println(bodyText2);
//		Assert.assertTrue(bodyText2.contains("Thank you for activating your account"),"Text not found!");
		
		
		}

}
