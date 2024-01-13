package excelSheet;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelSheetUse 
{
								//Exception
	//1) FileNotFoundException --we have to write path wrong then occurd this exception 
	//This is java exception

	//2) NullPointerException
	//1st way==>whenever we read the location this location is blank beacuse not data(data is not available in file file is black)
	//then this exception is occurd
	
	//2nd way==>

	//3) IlegalStateException 
	//when your trying data is number type but we have write string value so, we cannot getString
	//value
	public static void main(String[] args) throws EncryptedDocumentException, IOException
	{
		FileInputStream myFile= new FileInputStream("F:\\ExcelSheetEclilpse\\ExcelSheetEclilpse.xlsx");
		
		String value = WorkbookFactory.create(myFile).getSheet("Sheet1").getRow(4).getCell(1).getStringCellValue();

		System.out.println(value);
	}

}

//Step-2 we use workbookfactory
//create --> return type --> Workbook(Interface)-->casting beacuse class,interface 