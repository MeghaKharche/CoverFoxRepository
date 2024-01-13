package excelSheet;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadSelectParticularData {

	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		FileInputStream excelFilePath = new FileInputStream("F:\\ExcelSheetEclilpse\\ExcelSheetEclilpse.xlsx");
				
		String data= WorkbookFactory.create(excelFilePath).getSheet("sheet1").getRow(3).getCell(0).getStringCellValue();
		System.out.println(data);
	}

}
