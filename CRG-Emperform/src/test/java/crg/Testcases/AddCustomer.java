package crg.Testcases;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import crg.BaseClass.BaseClass;

public class AddCustomer extends BaseClass{
	@Test(dataProvider="getData")
	public void addCustomer(String fname,String lname,String postcode) throws InterruptedException
	{
		
		
		driver.findElement(By.cssSelector(or.getProperty("addcusButton"))).click();
		
		Thread.sleep(3000);
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
		String sheet="AddCustomer";
		int row=excel.getRowCount(sheet);
		int col=excel.getColumnCount(sheet);
		Object [][]data=new Object[row-1][col];
		for (int rowNum=2;rowNum<=row;rowNum++)
		{
			for (int colNum=0;colNum<col;colNum++)
			{
				data[rowNum-2][colNum]=excel.getCellData(sheet, colNum, rowNum);
			}
			
		}
		return data;
	}

}
