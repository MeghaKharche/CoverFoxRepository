package excelSheet;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
//import org.apache.poi.sl.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;


public class WholeRowAndColumnData 
{

	public static void main(String[] args) throws EncryptedDocumentException,
	IOException
	{
		FileInputStream myFile=new FileInputStream("F:\\ExcelSheetEclilpse\\ExcelSheetEclilpse.xlsx");

		Workbook myWorkbook = WorkbookFactory.create(myFile);
		org.apache.poi.ss.usermodel.Sheet mySheet =myWorkbook.getSheet("Sheet1");
		
		//how to read whole row
		for(int i=0;i<=1;i++)
		{
			String value = ((org.apache.poi.ss.usermodel.Sheet) mySheet).getRow(0).getCell(i).getStringCellValue();//0-->2
			System.out.print(value+"==>Whole Row data");
		}
		System.out.println();

		System.out.println("======================================");
		
		//how to read whole column (cell)
		for(int i=0;i<=2;i++)
		{
			String value = ((org.apache.poi.ss.usermodel.Sheet) mySheet).getRow(i).getCell(2).getStringCellValue();
			System.out.println(value+ "==>Whole Column Data ");
		}

	}
}
