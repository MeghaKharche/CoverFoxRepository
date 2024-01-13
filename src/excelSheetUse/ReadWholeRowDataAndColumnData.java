package excelSheetUse;

import java.io.FileInputStream;

import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadWholeRowDataAndColumnData {

	public static void main(String[] args) throws IOException 
	{
		//HOW TO READ WHOLE ROW VALUE
		
		//to create object of FileInputStream class & in that we pass parameter i.e my excel file path 
		//then after i write my excelfile name
		FileInputStream myfilepath = new FileInputStream("F:\\ExcelSheetEclilpse\\ExcelSheetProg1.xlsx");
		
		//then we create WorkbookFactory class that refers to xlxs file
		Workbook myworkbook = WorkbookFactory.create(myfilepath);
		
		//HOW TO READ WHOLE ROW DATATYPE
		Sheet mySheet = myworkbook.getSheet("sheet1"); 
		
//TO read Datatype by ExcelSheet
//		Row myRow = mySheet.getRow(1);
//		
//		Cell myCell = myRow.getCell(0);
//		 
//		 //i don't know which datatype use in excel sheet using getCellType() to get datatype
//		 //to get data type so, i use getCellType() method
//		 //without using getStringCellValue() i fetch which datatype use 
//		 CellType myDataType = myCell.getCellType();
//		 
//		 System.out.println("Datatype use to excel sheet "+myDataType);

		 //HOW TO READ WHOLE ROW VALUE
		 for(int i=0; i<=2; i++)
		{
			String value = mySheet.getRow(0).getCell(i).getStringCellValue();//0-->1
			System.out.print(value+" ");
		}
		System.out.println();
		 
		
		//HOW TO READ WHOLE COLUMN VALUE
		 for(int i=0; i<=1; i++)
			{
				String value = mySheet.getRow(i).getCell(2).getStringCellValue();//
				System.out.print(value+" ");
			}
			System.out.println();

	}

}
