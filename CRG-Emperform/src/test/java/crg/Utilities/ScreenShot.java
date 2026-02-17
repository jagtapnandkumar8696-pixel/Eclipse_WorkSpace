package crg.Utilities;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.apache.velocity.texen.util.FileUtil;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import crg.BaseClass.BaseClass;

public class ScreenShot extends BaseClass{
	public static String screenShotPath;
	public static String screenShotName;
	public static void  takeScreenShot() throws IOException
	{
		File fi=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		screenShotName="error.jpg";
		FileUtils.copyDirectory(fi, new File(System.getProperty("user.dirc"+"\\target\\surefire-reports\\html\\"+screenShotName)));
		
	}

}
