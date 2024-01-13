package excelSheetUse;

import java.io.FileInputStream;
//import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;



public class ReadDataTypeonWorkSheet {

	public static void main(String[] args) throws IOException 
	{
		//HOW TO READ WHOLE ROW VALUE

		FileInputStream myFilePath = new FileInputStream("F:\\ExcelSheetEclilpse\\ExcelSheetProg1.xlsx");
	
		Workbook myWorksheet = WorkbookFactory.create(myFilePath);
		
		Sheet mySheet = myWorksheet.getSheet("sheet1");
		
		Row myRow = mySheet.getRow(1);
		Cell myCell = myRow.getCell(0);
	
		//i don't know which datatype use in excel sheet using getCellType() to get datatype
		//to get data type so, i use getCellType() method
		//without using getStringCellValue() i fetch which datatype use 
		
		CellType myDataType = myCell.getCellType();
		 
		System.out.println("Datatype use to excel sheet "+myDataType);
	}

}
