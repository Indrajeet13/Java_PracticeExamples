package JavaExamples;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class WriteDataIntoTextFile {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		FileWriter fw = new FileWriter("D:\\Selenium\\Test123.txt");
		
		BufferedWriter bw = new BufferedWriter(fw);
		
		bw.write("Selenium");
		bw.write("Selenium in Java");
		bw.write("Selenium in python");
		
		System.out.println("Finished");
		
		bw.close();
	}

}
