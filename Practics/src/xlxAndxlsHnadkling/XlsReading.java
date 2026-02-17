package xlxAndxlsHnadkling;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;

import org.apache.poi.sl.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;





public class XlsReading {

	public static void main(String[] args) throws IOException {
		File f=new File("test");
		FileInputStream fs=new FileInputStream(f);
		XSSFWorkbook wb=new XSSFWorkbook(fs);
		XSSFSheet ss=wb.getSheetAt(0);
		for(Row r :ss)
		{
			for(Cell c : r)
			{
				if(c.getCellType()==CellType.NUMERIC);
				{
				System.out.println((int)c.getNumericCellValue());
				}
			}
			
		}
		
	
	}

}
