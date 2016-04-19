package Utility;

import java.io.File;
import java.io.IOException;
import java.net.InetAddress;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class CaptureScreenshot 
{
	static String finalPath;

	public static String takeScreenshot(WebDriver driver, String screenshotname) throws Throwable 
	{
		TakesScreenshot ts = (TakesScreenshot) driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		String userDirectory = System.getProperty("user.dir");
		InetAddress address = InetAddress.getLocalHost();
		String hostIP = address.getHostAddress();		
		String splitDir[] = userDirectory.split(":");		
		String destination = "\\\\"+hostIP+splitDir[1]+"\\Screenshots\\"+screenshotname+System.currentTimeMillis()+".jpg";
		try 
		{
			FileUtils.copyFile(src, new File(destination));
		}
		catch (IOException e) 
		{

		}
		return destination;
	}
}