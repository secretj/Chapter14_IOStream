package ch14_1_iostream;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class WriteExam {
	public static void main(String[] args) throws Exception {
		Writer writer =new FileWriter("C:/Temp/test7.txt");
		char a1 ='��';
		char b1 ='��';
		char c1 ='��';
		char a ='��';
		char b ='��';
		char c ='��';
		
		writer.write(a1);
		writer.write(b1);
		writer.write(c1);
		writer.write(a);
		writer.write(b);
		writer.write(c);
		
		writer.flush();
		writer.close();

		
	}

}
