package UnitTest;

import org.testng.Assert;
import org.testng.annotations.Test;
import DataProvider.ExcelDataProvider;

public class ExcelDataProviderUnitTest 
{	
	@Test
	public void testExcelDataProvider() throws Exception
	{		
		ExcelDataProvider excel = new ExcelDataProvider();		
		String data = excel.getCellData(0, 0, 0);
		System.out.println("Data in the first cell of the sheet is : "+data);		
		Assert.assertEquals(data, "Non Authorised User");		
		String password = excel.getCellData(0, 0, 1);
		System.out.println("Data in the first cell of the collum 1 is : "+password);
		Assert.assertEquals(password, "Authorised User");			
		int lastUsedRowSheet1 = excel.getLastUsedRow(0);
		System.out.println("Last used Row in Sheet 1 is : "+lastUsedRowSheet1);
		Assert.assertEquals(lastUsedRowSheet1, 5);			
		excel.writeToNextFreeCell(0,0,"Barca");		
		excel.writetoexcel();
		
	}	
	
}
