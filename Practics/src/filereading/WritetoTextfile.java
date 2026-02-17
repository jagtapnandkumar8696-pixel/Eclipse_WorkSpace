package filereading;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

//import jdk.jfr.internal.BufferWriter;

public class WritetoTextfile {

	public static void main(String[] args) throws IOException {
		// to write csv file...just use csv instead of txt
		File f=new File("E:\\Writeing\\mytext.txt");
		//this controctor of Filewriter class write towith appending ..not overwrite
		FileWriter fw=new FileWriter(f,true);
		BufferedWriter bf=new BufferedWriter(fw);
	
		for(int i=0;i<4;i++)
		{
			for(int j=0;j<3;j++)
				
			{
				int num=(int)(Math.random()*100);
				//if CSv file use then just , insted of /t
			bf.write(num+"\t");
				
				
			}
			bf.newLine();
				
		}
		bf.close();
	}

}
