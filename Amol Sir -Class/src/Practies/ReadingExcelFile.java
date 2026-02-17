package Practies;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.commons.compress.archivers.dump.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.FormulaEvaluator;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
//import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class ReadingExcelFile {

	public static void main(String[] args) throws InvalidFormatException, IOException {
		
		File f=new File("D:\\Readxlx\\mytext.xlsx");
		FileInputStream fi=new FileInputStream(f);
		Workbook wb=WorkbookFactory.create(fi);
		Sheet sheet=wb.getSheetAt(0);
		for(Row rw :sheet)
		{
			for (Cell ce : rw)
			{
				if (ce.getCellType()==CellType.NUMERIC)
				{
					System.out.println((int)ce.getNumericCellValue()+" ");
				}
				if (ce.getCellType()==CellType.STRING)
				{
					System.out.println(ce.getStringCellValue()+" ");
				}
				if (ce.getCellType()==CellType.BLANK)
				{
					System.out.println("Blank cell"+"\t");
				}
			}
			
			System.out.println();
		}
        
	}
	

}
