package UnitTest;

import java.net.InetAddress;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import org.testng.annotations.Test;
public class TestScroll 
{

	
	static DateFormat dateFormat = new SimpleDateFormat("E.MMMM.yyyy_HH.mm.ss[a]");
	static Date date = new Date();
	static String userDirectory =  System.getProperty("user.dir");
	static String emailReportPath = userDirectory+"/ExtentReports/SchoolOfDragonsLive_" +dateFormat.format(date) + ".html";
	static String path = userDirectory.replace("\\","/");
	static String reportPath = "\\\\172.20.11.105\\d\\JenkinsWorkspace\\LiveLoginTestCases\\ExtentReports\\SchoolOfDragonsLive_" +dateFormat.format(date) + ".html";	
	
	@Test
	public static void getIp() throws Throwable
	{
		InetAddress address = InetAddress.getLocalHost(); 
	    String hostIP = address.getHostAddress() ;
	    String hostName = address.getHostName();
	    System.out.println( "IP: " + hostIP + "\n" + "Name: " + hostName);	    
	    String splitDir[] = userDirectory.split(":");  
		System.out.println(splitDir[1]); 		
		String finalPath = "\\\\"+hostIP+splitDir[1];
		System.out.println(finalPath);
	}
	

}
