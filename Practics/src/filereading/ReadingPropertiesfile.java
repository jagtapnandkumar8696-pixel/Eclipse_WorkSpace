package filereading;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.Set;

public class ReadingPropertiesfile {

	public static void main(String[] args) throws IOException {
		
		Properties pf=new  Properties();
		//FileInputStream fis=new FileInputStream("C:\\Users\\Nandkumar.IISADMINSERVER\\eclipse-workspace\\Practics\\src\\filereading\\config.properties");
		
		// above line and this same..but this will help if location get change...so after the user.dir remaining path will be same 
		FileInputStream fis=new FileInputStream(System.getProperty("user.dir")+"\\src\\filereading\\config.properties");
		pf.load(fis);
		
		//paramater name is case sensative ..Age is given properties file so we have use Age not age
		System.out.println(pf.getProperty("Age"));
		
		//this will give project location 
	System.out.println(System.getProperty("user.dir"));

	}

}

