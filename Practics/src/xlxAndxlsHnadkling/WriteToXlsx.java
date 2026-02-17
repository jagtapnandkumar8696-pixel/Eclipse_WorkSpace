package xlxAndxlsHnadkling;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.sl.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

//import com.sun.rowset.internal.Row;

public class WriteToXlsx {

	public static void main(String[] args) throws IOException {
File f=new File("E:\\Writeing\\test.xlsx");
		
		FileOutputStream fo=new FileOutputStream(f);
		XSSFWorkbook wb=new XSSFWorkbook();
		
		XSSFSheet sh=wb.createSheet("Test");
		
	/*	Row r1=sh.createRow(0);
		Cell c1=r1.createCell(0);
		Cell c2=r1.createCell(1);
		
		c1.setCellValue("Test");
		c2.setCellValue("Best");*/
		
	
		for(int row=0;row<10;row++)
		{
			Row r1=sh.createRow(row);
			for(int col=0;col<10;col++)
			{
				Cell c1=r1.createCell(col);
				c1.setCellValue((int)(Math.random()*100));
			}
			
		}
		
		//connection

		wb.write(fo);
		
		
		
fo.close();
System.out.println("wrtten succesffully" );
	}

}
