package crg.Liteners;

import java.io.IOException;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

import crg.Utilities.ScreenShot;



public class Customlisteners implements ITestListener {

	public void onTestStart(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	public void onTestSuccess(ITestResult result) {
		try {
			ScreenShot.takeScreenShot();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.setProperty("org.uncommons.reportng.escape-output", "false");//to generate link for attachment in html report
		//Reporter.log("<a target=\"_blank\" href\"D:\\ScreenShot\\Scr.png\">ScrenShot</a>");
		Reporter.log("<a target=\"_blank\" href="+ScreenShot.screenShotName+">ScrenShot</a>");
		Reporter.log("<br>");
		Reporter.log("<a target=\"_blank\" href="+ScreenShot.screenShotName+"><img src="+ScreenShot.screenShotName+" hight=200 width=200></img></a>");
		
		
	}

	public void onTestFailure(ITestResult result) {
		
		
		try {
			ScreenShot.takeScreenShot();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.setProperty("org.uncommons.reportng.escape-output", "false");//to generate link for attachment in html report
		//Reporter.log("<a target=\"_blank\" href\"D:\\ScreenShot\\Scr.png\">ScrenShot</a>");
		Reporter.log("<a target=\"_blank\" href="+ScreenShot.screenShotName+">ScrenShot</a>");
		Reporter.log("<br>");
		Reporter.log("<a target=\"_blank\" href="+ScreenShot.screenShotName+"><img src="+ScreenShot.screenShotName+" hight=200 width=200></img></a>");
		
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
