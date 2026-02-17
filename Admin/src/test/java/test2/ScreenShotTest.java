package test2;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.imageio.ImageIO;

import org.apache.commons.io.FileUtils;
import org.apache.commons.io.FilenameUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Point;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ScreenShotTest {

	public static void main(String[] args) throws IOException, InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.seleniumeasy.com/test/");
		
		driver.manage().window().maximize();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//a[@title='Close']")).click();
		Date date=new Date();
		SimpleDateFormat sd= new  SimpleDateFormat("yy-mm-dd-hh");
		String str=sd.format(date);
		TakesScreenshot ts=(TakesScreenshot)driver;
		File f= ts.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(f, new File("F:\\EP5.3SP3\\"+str+"_error.jpg"));
		Thread.sleep(4000);
		//driver.findElement(By.xpath("//img[@alt='Selenium Easy']")).click();
		
		
		WebElement web=driver.findElement(By.xpath("//img[@alt='Selenium Easy']"));
		Thread.sleep(4000);
		Point p=web.getLocation();
		int hight =web.getSize().getHeight();
		int width=web.getSize().getWidth();
		BufferedImage br=ImageIO.read(f);
		BufferedImage br1=br.getSubimage(p.x, p.y, hight, width+50);
	ImageIO.write(br1, "jpg", f);
	FileUtils.copyFile(f, new File ("F:\\EP5.3SP3\\"+str+"_error1.jpg"));

	}

}
