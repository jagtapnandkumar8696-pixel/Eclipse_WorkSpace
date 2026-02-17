package filereading;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class WriteToHtml {

	public static void main(String[] args) throws IOException {
		File f=new File("E:\\Writeing\\mytext.HTML");
		//this controctor of Filewriter class write towith appending ..not overwrite
		FileWriter fw=new FileWriter(f);
		BufferedWriter bf=new BufferedWriter(fw);
	
       bf.write("<html><body><title>WayToAutomation</title><h1>Nandkumar</h1></body></html>");
       bf.close();
	}

}
