package UnitTest;

import java.io.File;
import java.io.IOException;
import java.net.InetAddress;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import Factory.ConfigDataProviderFactory;
public class TestScroll 
{

	
	static DateFormat dateFormat = new SimpleDateFormat("E.MMMM.yyyy_HH.mm.ss[a]");
	static Date date = new Date();
	static String userDirectory =  System.getProperty("user.dir");
	static String emailReportPath = userDirectory+"/ExtentReports/SchoolOfDragonsLive_" +dateFormat.format(date) + ".html";
	static String path = userDirectory.replace("\\","/");
	static String reportPath = "\\\\172.20.11.105\\d\\JenkinsWorkspace\\LiveLoginTestCases\\ExtentReports\\SchoolOfDragonsLive_" +dateFormat.format(date) + ".html";	
	
//	@Test
//	public static void getIp() throws Throwable
//	{
////		InetAddress address = InetAddress.getLocalHost(); 
////	    String hostIP = address.getHostAddress() ;
////	    String hostName = address.getHostName();
////	    System.out.println( "IP: " + hostIP + "\n" + "Name: " + hostName);	    
////	    String splitDir[] = userDirectory.split(":");  
////		System.out.println(splitDir[1]); 		
////		String finalPath = "\\\\"+hostIP+splitDir[1];
////		System.out.println(finalPath);
//		
		//static File dir1 = new File("directory-source");
//		
//		if(dir1.isDirectory()) 
//		{
//		    File[] content = dir1.listFiles();
//		    System.out.println(content.length);
//		    for(int i = 0; i < content.length; i++) 
//		    {
//		    	File sourceFile = new File("D:/Files/"+content[i]);
//		    	File destinationFile = new File("D:/Files1/"+content[i]);		        
//		        FileUtils.moveFile(sourceFile, destinationFile);
//		    }
//		    System.out.println(content.length);
//		}
//	}
	
	public static void main(String[] args) throws IOException {

		//File sourceFile = new File("directory-source/test1.txt");
		File destinationDir = new File("directory-destination");		
		File sourceDir = new File("directory-source");
		//System.out.println(sourceFile);

		//FileUtils.moveFileToDirectory(sourceFile, destinationDir, true);
		
		
		if(destinationDir.isDirectory()) 
			{
			    File[] content = sourceDir.listFiles();
			    
			    System.out.println(content.length);
			    for(int i = 0; i < content.length; i++) 
			    {
			    	//sourceFile = new File(content[i]);
			    	System.out.println(content[i]);
			    	FileUtils.moveFileToDirectory(content[i], destinationDir, true);			
			    }
			    System.out.println(content.length);

	}
	}
	
	@Test
	public void testAuthChrome() throws IOException, InterruptedException
	{
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", ConfigDataProviderFactory.getConfig().getChromePath());
		driver = new ChromeDriver();
		Runtime.getRuntime().exec("C:\\Users\\subramanyakb\\Desktop\\ChromeAuthetication.exe");
		driver.get("http://qa.schoolofdragons.com/");
		
		System.out.println("Website opened");
		
		Thread.sleep(15000);
		
		Assert.assertTrue(driver.findElement(By.xpath("//div[@id='ctl00_logindiv']/a[2]")).isDisplayed());
		
		System.out.println("Element is present");	
		
		driver.close();
		driver.quit();
		
		System.out.println("Closed all");
		
	}
	

}
