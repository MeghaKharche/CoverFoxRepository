package readDataUsingPropertiesFiles;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class ReadDataUsingProperties 
{
	//which data we add in property file 
	//age= 30 y      //mobileNumber = 9876574637   	//pincode  = 412105
	public static void main(String[] args) throws IOException
	{
		Properties prop = new Properties();
		
	//	FileInputStream propertiesFilePath = new FileInputStream("C:\\\\Users\\\\USER\\\\eclipse-workspace\\\\first_page\\\\seleniumMegha\\\\CoverFoxReadDataUsingPropertyFiles.properties"); 
		
		FileInputStream propertiesFilePath = new FileInputStream(("user.dir")+"\\CoverFoxReadDataUsingPropertyFiles.properties");
		
		prop.load(propertiesFilePath);
		
		String name = prop.getProperty("Name");
		
		System.out.println(name);
		
		String mobnumber = prop.getProperty("MobileNumber");
		
		System.out.println(mobnumber);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
//		//create object of properties file
//		Properties prop = new Properties();
//		
//		//create object of fileInputStream ==> excel sheet data
//		FileInputStream myFile = new FileInputStream("C:\\Users\\USER\\eclipse-workspace\\first_page\\seleniumMegha\\CoverFoxReadDataUsingPropertyFiles.properties");
//		
//		//using user.dir ==>get all project path
////		FileInputStream filePath= new FileInputStream(System.getProperty("user.dir")+"\\CoverFoxReadDataUsingPropertyFiles.properties");
//		
//		//use load method 
//		prop.load(myFile);
//		
//		String value = prop.getProperty("Name");
//		System.out.println(value);
//		
//		System.out.println(prop.getProperty("MobileNumber"));
		
	}
}
