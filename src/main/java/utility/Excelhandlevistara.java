package utility;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excelhandlevistara {
	 
	
	public static String getcellvalue (String excel,String sheet,int r, int c)
	{
		try 
		{
			FileInputStream fi =new FileInputStream(excel);
			XSSFWorkbook wb=new XSSFWorkbook(fi);
			XSSFCell cell=wb.getSheet(sheet).getRow(r).getCell(c);
			
			if (cell.getCellType()==CellType.STRING)
			{
				return cell.getStringCellValue();	
			}
			else
			{
				return cell.getRawValue();
			}
		}
		catch (Exception e)
		{
		return "";	
		}
		
	}
	
	public static int getrowcount (String excel,String sheet)
	{
		try
		{
			FileInputStream fi =new FileInputStream(excel);
			XSSFWorkbook wb=new XSSFWorkbook(fi);
			return wb.getSheet(sheet).getLastRowNum();
		}
		catch (Exception e)
		{
			return 0;
		}
	}
		
	}
	


