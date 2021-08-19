package ch14_1_iostream;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class WriteExam3 {
	public static void main(String[] args) throws Exception {
		Writer writer =new FileWriter("C:/Temp/test9.txt");
		
		char[] a ={'A','B','C','D','E'};
	
		
		writer.write(a,1,3);
	
		writer.flush();
		writer.close();

		
	}

}
