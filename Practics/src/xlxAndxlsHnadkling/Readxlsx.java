package xlxAndxlsHnadkling;

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

public class Readxlsx {

	public static void main(String[] args) throws InvalidFormatException, IOException {
		
		File f=new File("E:\\Writeing\\mytext.xlsx");
		FileInputStream fi=new FileInputStream(f);
		Workbook wb=WorkbookFactory.create(fi);
		Sheet sh=wb.getSheetAt(0);
		
          for(Row row : sh)
          {
        	  for(Cell ce :row)
        	  {
        		  if(ce.getCellType() == CellType.NUMERIC)
        		  { 
        			  System.out.print((int)(ce.getNumericCellValue())+ "  ");
        		  }
        		  else if(ce.getCellType() == CellType.STRING)
        		  {
        			  System.out.print(ce.getStringCellValue());
        			 
        		  }
        		  else if(ce.getCellType() == CellType.BLANK)
        		  {
        			  System.out.print("Blank cell"+"\t");
        			 
        		  }
        		 
        			 
        		  
        	  }
        		  
        		  
        		System.out.println("");  
          }
	

		}

}
