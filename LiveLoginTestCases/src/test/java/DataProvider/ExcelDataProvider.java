package DataProvider;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import Factory.ExcelDataProviderFactory;

public class ExcelDataProvider 
{
	XSSFWorkbook wb;
	XSSFSheet sheet;
	XSSFRow row;
	XSSFCell cell;

	public ExcelDataProvider() 
	{

		File src = new File("D:/Usernames Excels/Usernames.xlsx");

		try {
			FileInputStream fis = new FileInputStream(src);

			wb = new XSSFWorkbook(fis);
		} 
		catch (Exception e) 
		{

		}

	}

	public int getLastUsedRow(int sheetIndex) 
	{
		int lastUsedRowNumber = wb.getSheetAt(sheetIndex).getLastRowNum();

		return lastUsedRowNumber;
	}

	public String getCellData(int sheetIndex, int rowNumber, int colNumber) 
	{
		
		final DataFormatter df = new DataFormatter();
		
		cell = wb.getSheetAt(sheetIndex).getRow(rowNumber).getCell(colNumber);
		
		if(cell==null)
		{
			return "Empty Cell";
		}
		else
		{
			String cellData = df.formatCellValue(cell);
			
			return cellData;		
		}		
		
	}
	
	public int getFirstRowContains(int sheetIndex, String searchData, int colNumber)
	{
		
		int i = 0;
		int usedRowCount = ExcelDataProviderFactory.getExcel().getLastUsedRow(sheetIndex);
		for(;i<usedRowCount;i++)
		{			
			
			if(ExcelDataProviderFactory.getExcel().getCellData(sheetIndex,i,colNumber).equalsIgnoreCase(searchData))
			{
				break;
			}			
		}
		return i;
	}
	
	public static int getTotalTestSteps(int sheetIndex, int firstStep,String data,int colNumber)
	{
		
		int usedRowCount = ExcelDataProviderFactory.getExcel().getLastUsedRow(sheetIndex);
		
		for(;firstStep<usedRowCount;firstStep++)
		{			
			if(!data.equals(ExcelDataProviderFactory.getExcel().getCellData(sheetIndex,colNumber,firstStep)))
			{
				break;
			}
		}
		return firstStep;
	}
	
	public void writeexcel(String Result, int RowNum, int ColNum) 
	{
		try 
		{
			sheet = wb.getSheetAt(0);
			row = sheet.createRow(RowNum);

			cell = row.getCell(ColNum, org.apache.poi.ss.usermodel.Row.RETURN_BLANK_AS_NULL);

			if (cell == null) 
			{

				cell = row.createCell(ColNum);

				cell.setCellValue(Result);

			}
			else 
			{

				cell.setCellValue(Result);

			}

		} 
		catch (Exception e) 
		{
			e.printStackTrace();
		}
	}

	public void writetoexcel()
	{

		try 
		{
			FileOutputStream out = new FileOutputStream("D:/Usernames Excels/Usernames.xlsx");
			wb.write(out);
			out.close();
			System.out.println("Usernames.xlsx written successfully on disk.");
		} 
		catch (Exception e) 
		{
			e.printStackTrace();
		}

	}
	
	public void writeToNextFreeCell(int sheetIndex,int colNum,String result)
	{
		int rowNum = getLastUsedRow(sheetIndex);
		System.out.println(rowNum);
		rowNum = rowNum+1;
		try 
		{
			
			sheet = wb.getSheetAt(sheetIndex);
			row = sheet.createRow(rowNum);
			cell = row.getCell(colNum, org.apache.poi.ss.usermodel.Row.RETURN_BLANK_AS_NULL);

			if (cell == null) 
			{

				cell = row.createCell(colNum);

				cell.setCellValue(result);

			}
			else 
			{

				cell.setCellValue(result);

			}

		} 
		catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
	
	public void writeToNextFreeCell1(int sheetIndex,int colNum,String result)
	{
		int rowNum = getLastUsedRow(sheetIndex);
		System.out.println(rowNum-1);
		rowNum = rowNum-1;
		try 
		{
			
			sheet = wb.getSheetAt(sheetIndex);
			row = sheet.createRow(rowNum);
			cell = row.getCell(colNum, org.apache.poi.ss.usermodel.Row.RETURN_BLANK_AS_NULL);

			if (cell == null) 
			{

				cell = row.createCell(colNum);

				cell.setCellValue(result);

			}
			else 
			{

				cell.setCellValue(result);

			}

		} 
		catch (Exception e) 
		{
			e.printStackTrace();
		}
	}

}
