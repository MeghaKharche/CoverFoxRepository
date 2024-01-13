package excelSheetUse;

import java.io.FileInputStream;
import java.io.IOException;


import org.apache.poi.ss.usermodel.WorkbookFactory;


public class ReadDataOnWorkSheet {

	public static void main(String[] args) throws IOException  
	{
		//How to read the excel file To particular name(single name)
	
		//to create object of FileInputStream class & in that we pass parameter i.e my excel file path 
		//then after i write my excelfile name
		FileInputStream myfile = new FileInputStream("F:\\ExcelSheetEclilpse\\ExcelSheetProg1.xlsx");;

		//then we create WorkbookFactory class that refers to xlxs file
		String workBookResult = WorkbookFactory.create(myfile).getSheet("sheet1").getRow(1).getCell(2).getStringCellValue();
		
		//i write printing statement to fetch from excelfile
		System.out.println("The Data row1 & cell2 ==>"+workBookResult);
		
		FileInputStream myfile1 = new FileInputStream("F:\\ExcelSheetEclilpse\\ExcelSheetProg1.xlsx");;
		String workBookResult1 = WorkbookFactory.create(myfile1).getSheet("sheet1").getRow(0).getCell(1).getStringCellValue();
		System.out.println("The Data row0 & cell1 ==>"+workBookResult1);
		
		FileInputStream myfile2 = new FileInputStream("F:\\ExcelSheetEclilpse\\ExcelSheetProg1.xlsx");;
		String workBookResult2 = WorkbookFactory.create(myfile2).getSheet("sheet1").getRow(1).getCell(0).getStringCellValue();
		System.out.println("The Data row1 & cell0 ==>"+workBookResult2);
	}

}
