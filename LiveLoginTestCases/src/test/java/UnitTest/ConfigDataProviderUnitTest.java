package UnitTest;

import org.testng.Assert;
import org.testng.annotations.Test;

import DataProvider.ConfigDataProvider;

public class ConfigDataProviderUnitTest 
{	
	@Test
	public void testGetChromePath()
	{
		ConfigDataProvider config = new ConfigDataProvider();
		String chromePath = config.getChromePath();			
		Assert.assertEquals(chromePath, "./Drivers/chromedriver.exe");			
	}
	
	@Test
	public void testGetIePath()
	{
		ConfigDataProvider config = new ConfigDataProvider();
		String iePath = config.getIEPath();		
		Assert.assertEquals(iePath, "./Drivers/IEDriverServer.exe");				
	}
}
