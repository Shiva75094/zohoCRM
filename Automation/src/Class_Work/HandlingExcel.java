package Class_Work;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class HandlingExcel 
{

	public static void main(String[] args) throws EncryptedDocumentException, IOException
	{
		FileInputStream fis=new FileInputStream("./data/Testscript.xlsx");
		Workbook wb=WorkbookFactory.create(fis);
		String data=wb.getSheet("CreateCustomer").getRow(1).getCell(3).toString();
		System.out.println(data);

	}

}
