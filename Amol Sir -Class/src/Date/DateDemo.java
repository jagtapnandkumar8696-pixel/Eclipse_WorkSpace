package Date;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateDemo {
//coverting date to string
	public static void main(String[] args) {
		Date date=new Date();
		System.out.println(date);
		SimpleDateFormat sd=new SimpleDateFormat("EEEE/MMM/yyyy/");
		String str=sd.format(date);
		System.out.println(str);
		SimpleDateFormat sd1=new SimpleDateFormat("EEEE-dd/MMM/yyyy/");
		String str1=sd1.format(date);
		System.out.println(str1);
		SimpleDateFormat sd2=new SimpleDateFormat("dd/MMM/yyyy|hh:mm:ss");
		String str2=sd2.format(date);
		System.out.println(str2);
		SimpleDateFormat sd3=new SimpleDateFormat("EE/MMM/yyyy/");
		String str3=sd3.format(date);
		System.out.println(str3);

	}

}
