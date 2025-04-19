package excelClass;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelMain {
	static FileInputStream f;//To retrieve details from File(Test)
	static XSSFWorkbook wb;//To get details from Workbook(when we open)
	static XSSFSheet sh;//To get details from Sheet
	public static String getStringData(int a,int b) throws IOException//here method is user defined
	{
		f=new FileInputStream("C:\\Users\\sinu.marina\\Documents\\Gulf_SHIFT_API\\Test1.xlsx");//assigning path to f
		wb= new XSSFWorkbook(f);//Workbook in file f
		sh=wb.getSheet("sheet1");// sheet inside workbook from method getsheet.
		XSSFRow r =sh.getRow(a);
		XSSFCell c = r.getCell(b);
		return c.getStringCellValue();//To return String value using this method 
		
	}
	
	public static String getIntegerData(int a, int b) throws IOException
	{
		
		f=new FileInputStream("C:\\Users\\sinu.marina\\Documents\\Gulf_SHIFT_API\\Test1.xlsx");//assigning path to f
		wb= new XSSFWorkbook(f);//Workbook in file f
		sh=wb.getSheet("sheet1");// sheet inside workbook from method getsheet.
		XSSFRow r =sh.getRow(a);
		XSSFCell c = r.getCell(b);
		int x = (int)c.getNumericCellValue();
		return String.valueOf(x);
		
	}
	

}
