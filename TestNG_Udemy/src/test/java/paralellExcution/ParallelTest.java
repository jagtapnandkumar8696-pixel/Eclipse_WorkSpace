package paralellExcution;

import java.util.Date;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParallelTest {
	@Parameters({"browser"})
	@Test
	public void getBrowser(String browser) throws InterruptedException
	{
		Date d =new Date();
		//Thread.sleep(2000);
		System.out.println(browser+"and Time "+d);
	}

}
