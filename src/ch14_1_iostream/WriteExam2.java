package ch14_1_iostream;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class WriteExam2 {
	public static void main(String[] args) throws Exception {
		Writer writer =new FileWriter("C:/Temp/test8.txt");
		
		char[] a ={'A','B','C'};
	
		
		writer.write(a);
	
		writer.flush();
		writer.close();

		
	}

}
