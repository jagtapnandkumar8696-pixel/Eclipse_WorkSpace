package screenshotOnTestfailure;

public class TestConfig_N{


	
	public static String server="smtp.gmail.com";
	public static String from = "jagtap.nandkumar8696@gmail.com";
	public static String password = "@Nandkumar143@";
	public static String[] to ={"njagtap@crgroup.com"};
	public static String subject = "Test Report";
	
	public static String messageBody ="TestMessage";
	public static String attachmentPath=System.getProperty("user.dir")+"//Reports.zip";
	public static String attachmentName="reports.zip";
	
	
	
	
}
