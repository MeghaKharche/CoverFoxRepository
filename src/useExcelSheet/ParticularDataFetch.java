package useExcelSheet;

import java.io.FileInputStream;
//import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
//import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ParticularDataFetch {

	public static void main(String[] args) throws IOException
	{
		FileInputStream myfilepath = new FileInputStream("F:\\ExcelSheetEclilpse\\ExcelSheetProg1.xlsx");
		
		Workbook workBookMyFile = WorkbookFactory.create(myfilepath);
		//to read particular data
		//String myExcelSheet = workBookMyFile.getSheet("sheet1").getRow(1).getCell(1).getStringCellValue();
		
		Sheet myExcelSheet = workBookMyFile.getSheet("sheet1");
		//System.out.println(myExcelSheet);
		
		//how to read excelsheet datatype
		
//		Row row = myExcelSheet.getRow(0);
//		
//		Cell cell = row.getCell(0);
//		
//		CellType exceldatatype = cell.getCellType();
//		System.out.println("To read excelsheet datatype==> "+exceldatatype);
//		
//		//how to read whole row
//		
//		for(int i=0; i<=2; i++)
//		{
//			String wholeRowResult = myExcelSheet.getRow(0).getCell(i).getStringCellValue();
//			System.out.print("Whole row==> "+" "+wholeRowResult);
//		}
//		
//		//how to read whole column
//
//		for(int j=0; j<=1; j++)
//		{
//			String wholeRowResult = myExcelSheet.getRow(j).getCell(1).getStringCellValue();
//			System.out.print("Whole row==> "+" "+wholeRowResult);
//		}
		
		//Fetch all Excel sheetdata
		
		int totalrow = myExcelSheet.getLastRowNum();
		System.out.println(totalrow);
		
		//myExcelSheet.getRow(0).getLastCellNum()
		
		
		
	}

}