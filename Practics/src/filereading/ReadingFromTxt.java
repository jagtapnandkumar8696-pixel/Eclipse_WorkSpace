package filereading;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ReadingFromTxt {

	public static void main(String[] args) throws IOException {


		File f=new File("E:\\Writeing\\mytext.txt");
	
		FileReader fw=new FileReader(f);
		BufferedReader br=new BufferedReader(fw);
		
		String str=br.readLine();
		while(str!=null)
			
		{
			System.out.println(str);
			str=br.readLine();
		}
	
br.close();
	}

}
