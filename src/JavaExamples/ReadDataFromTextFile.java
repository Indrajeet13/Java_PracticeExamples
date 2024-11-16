package JavaExamples;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class ReadDataFromTextFile {

	public static void main(String[] args) throws IOException
	{
//		FileReader fr = new FileReader("D:\\Selenium\\Test.txt");
//		
//		BufferedReader br = new BufferedReader(fr);
//		
//		String str;
//		
//		while((str=br.readLine()) != null)
//		{
//			System.out.println(str);
//		}
//		br.close();
		
		//2 using Scanner and file
		
		File file = new File("D:\\Selenium\\Test.txt");
		
		Scanner sc = new Scanner(file);
		
		//loop statement
		
		while(sc.hasNextLine())
		{
			System.out.println(sc.nextLine() );
		}
		
		//approch 3
		
		sc.useDelimiter("\\Z");
		System.out.println(sc.nextLine());
		
		
		
		
		
	}

}
