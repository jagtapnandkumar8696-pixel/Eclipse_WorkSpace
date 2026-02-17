package crg.Testcases;

import org.openqa.selenium.By;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import crg.BaseClasses.TestBase;

public class AddCustomer extends TestBase {
	
	@Test(dataProvider="getData")
	public void addCustomer(String fname,String lname,String postcode) throws InterruptedException
	{
		
		driver.findElement(By.cssSelector(or.getProperty("addcusButton"))).click();
		driver.findElement(By.cssSelector(or.getProperty("firstnameText"))).sendKeys(fname);
		Thread.sleep(3000);
		driver.findElement(By.cssSelector(or.getProperty("lastnameText"))).sendKeys(lname);
		Thread.sleep(3000);
		driver.findElement(By.cssSelector(or.getProperty("postcodeText"))).sendKeys(postcode);
		Thread.sleep(3000);
		driver.findElement(By.cssSelector(or.getProperty("AddCusButtonchil"))).click();
		driver.switchTo().alert().accept();
		
	}
	
	@DataProvider
	public Object[][] getData()
	
	{
		String sheetName="AddCustomer";
		int rows=exlreader.getRowCount(sheetName);
		int cols=exlreader.getColumnCount(sheetName);
		Object [][] data=new Object[rows-1][cols];
		for(int rowNum=2;rowNum<=rows;rowNum++)
		{
			for(int colNum=0;colNum<cols;colNum++)
			{
				data[rowNum-2][colNum]=exlreader.getCellData(sheetName, colNum, rowNum);
			}
			
		}
		return data;
	}

}
