package excelSheetUse;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ToReadExcelSheetDataType {

	public static void main(String[] args) throws IOException
	{
		//HOW TO READ WHOLE ROW DATATYPE 
		
		//to create object of FileInputStream class & in that we pass parameter i.e my excel file path 
		//then after i write my excelfile name
		FileInputStream myfilepath = new FileInputStream("F:\\ExcelSheetEclilpse\\ExcelSheetProg1.xlsx");
		
		//then we create WorkbookFactory class that refers to xlxs file
		Workbook myworkbook = WorkbookFactory.create(myfilepath);
		
		//HOW TO READ WHOLE ROW DATATYPE
		Sheet mySheet = myworkbook.getSheet("sheet1"); 
		
		Row myRow = mySheet.getRow(1);
		
		Cell myCell = myRow.getCell(0);
		 
		 //i don't know which datatype use in excel sheet using getCellType() to get datatype
		 //to get data type so, i use getCellType() method
		 //without using getStringCellValue() i fetch which datatype use 
		 CellType myDataType = myCell.getCellType();
		 
		 System.out.println("Datatype use to excel sheet "+myDataType);
		


	}

}
