package crg.Listeners;

import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

import crg.Utilities.ScreenShot;

//import crg.Utilities.ScreenShot;

public class Customlisteners implements ITestListener{

	public void onTestStart(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	public void onTestSuccess(ITestResult result) {
		System.out.println("***** PASSED "+result.getName()+" test has passed *****");
		System.setProperty("org.uncommons.reportng.escape-output", "false");
		//Reporter.log("<a target=\"_blank\" href=\"D:\\ScreenShot\\Scr.png\">ScrenShot</a>");
		//Reporter.log("<a target=\"_blank\" href=\"D:\\ScreenShot\\Scr.png\"><img src=\"D:\\ScreenShot\\Scr.png\" hight=200 width=200></img></a>");
		ScreenShot sr=new ScreenShot();
		
		String methodName=result.getName().toString().trim();
		
		Reporter.log("<a target=\"_blank\" href="+sr.filePath+methodName+".jpg>ScrenShot</a>");
        //ITestContext context = result.getTestContext();
      // WebDriver driver = (WebDriver)context.getAttribute("driver");
		
		sr.takeScreenShot(methodName);
		
	}

	

	public void onTestFailure(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
		
	}

	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
		
	}

}
