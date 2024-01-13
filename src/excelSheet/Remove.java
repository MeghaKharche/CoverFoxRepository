package excelSheet;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Remove {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		// TODO Auto-generated method stub
		FileInputStream myFile=new FileInputStream("F:\\ExcelSheetEclilpse\\ExcelSheetEclilpse.xlsx");

		Workbook myWorkbook = WorkbookFactory.create(myFile);
		
		org.apache.poi.ss.usermodel.Sheet mySheet =myWorkbook.getSheet("Sheet1");
		
		//lastrowno and lastcell no noikal ke lena hai
		
		//mysheet.get
	}

}
