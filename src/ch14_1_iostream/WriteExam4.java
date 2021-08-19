package ch14_1_iostream;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class WriteExam4 {
	public static void main(String[] args) throws Exception {
		Writer writer =new FileWriter("C:/Temp/test10.txt");
		
		String a ="abc";
		
		
		writer.write(a);
		
		writer.flush();
		writer.close();

		
	}

}
