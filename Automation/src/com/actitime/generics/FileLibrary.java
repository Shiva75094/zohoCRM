package com.actitime.generics;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
/**
 * this is the generic class for data driven testing
 * @author Admin
 *
 */
public class FileLibrary 
{
	/**
	 * this is the generic method to read the data from property file
	 * @param key
	 * @return String
	 * @throws IOException
	 */
	public String getpropettyData(String key) throws IOException
	{
		FileInputStream fis=new FileInputStream("./data/Commondata.property");
		Properties p=new Properties();
		p.load(fis);
		String data=p.getProperty(key);
		return data;
	}
	/**
	 * this is the generic method to read the data from excel file
	 * @param sheetname
	 * @param row
	 * @param cell
	 * @return String
	 * @throws IOException 
	 * @throws EncryptedDocumentException 
	 */
	public String getExcelData(String sheetname,int row,int cell) throws EncryptedDocumentException, IOException
	{
		FileInputStream fis=new FileInputStream("./data/Testscript.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		String data = wb.getSheet(sheetname).getRow(row).getCell(cell).getStringCellValue();
		return data;
	}
	/**
	 * this is the generic method for writing the data to excel file
	 * @param sheetname
	 * @param row
	 * @param cell
	 * @param data
	 * @return 
	 * @throws IOException 
	 * @throws EncryptedDocumentException 
	 */
	public void setExcelData(String sheetname,int row,int cell,String data) throws EncryptedDocumentException, IOException
	{
		FileInputStream fis=new FileInputStream("./data/Testscript.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		wb.getSheet(sheetname).getRow(row).getCell(cell).setCellValue(data);
		FileOutputStream fos=new FileOutputStream("./data/Testscript.xlsx");
		wb.write(fos);
		wb.close();
	}

}

