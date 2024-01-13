package excelSheetUse;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadWholeWorkSheetData {

	public static void main(String[] args) throws IOException 
	{
		FileInputStream myFilePath = new FileInputStream("F:\\ExcelSheetEclilpse\\ExcelSheetProg1.xlsx");
		
		Workbook myWorksheet = WorkbookFactory.create(myFilePath);
		
		Sheet mySheet = myWorksheet.getSheet("sheet1");
		
		//To Read Whole ExcelSheet Data
	
		//outer for loop--> row-->0-->1
		for(int i=0;i<=1;i++)
		{
		
			//inner for loop--> cells-->0-->2
			for(int j=0;j<=2;j++)
			{
				String workSheetData = mySheet.getRow(i).getCell(j).getStringCellValue();
				System.out.print(workSheetData+" ");
			}
			System.out.println();
		}
	}
}
