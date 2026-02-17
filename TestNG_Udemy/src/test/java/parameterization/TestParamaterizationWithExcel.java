package parameterization;

import java.util.Hashtable;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestParamaterizationWithExcel {

	public static ExcelReader excel=null;
	
	@Test(dataProvider="dataProvider")
	
	public void dataReciver(Hashtable<String,String> obj)
	
	{
		
		//System.out.println(name +"----"+password+"----"+is_Correct+"-----");
		
	}
	@DataProvider
	public Object[][]dataProvider()
	{
		if(excel==null)
		{
			excel =new ExcelReader("F:\\Selenium\\mytext.xlsx");
		}
		String str="loginTest";
		int row=excel.getRowCount(str);
		int col=excel.getColumnCount(str);
		//-1 is taken becoz in excel first row is header
		Object obj[][]=new Object [row-1][col];
		
		Hashtable <String,String> ht=null;
		
		for(int rownum=2;rownum<=row;rownum++)
			
		{
			ht=new Hashtable<String,String>();
			
			for(int colnum=0;colnum<col;colnum++)
			{
			//	obj[rownum-2][colnum]=excel.getCellData(str, colnum, rownum);
				ht.put(excel.getCellData(str, colnum, 1), excel.getCellData(str, colnum, rownum));
				obj[rownum-2][0]=ht;
			}
		}
		
		
		return obj;
		
	}
}
