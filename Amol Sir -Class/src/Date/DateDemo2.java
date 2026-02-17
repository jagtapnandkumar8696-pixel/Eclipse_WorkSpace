package Date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateDemo2 {
	
public static void main(String[] args) throws ParseException
{
	String str= "12/11/2021:09:56:55";
	SimpleDateFormat sd=new SimpleDateFormat("/MM/yyyy:hh:mm:ss");
	Date date=sd.parse(str);
	System.out.println(date);
	
}
}
