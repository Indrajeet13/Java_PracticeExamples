package JavaExamples;

import java.util.Scanner;

public class ReverseEachWordInString {

	public static void main(String[] args) 
	{
		
		System.out.println("Enter the String ...");
		
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		
		//Approch1 
		
		
		String words[]=str.split(" ");	//Spliting string into words 
		
		String reverseString="";
		
//		for(String w:words)
//		{
//			String reverseWord = "";
//			
//			for(int i=w.length()-1;i>=0;i--)
//			{
//				reverseWord = reverseWord + w.charAt(i);
//			}
//			
//			reverseString = reverseString + reverseWord + " ";	//
//		}
//		
//		System.out.println(reverseString);

		
		//Approch 2
		
		String reverseWord="";
		
		for(String w:words)
		{
			StringBuilder sb = new StringBuilder(w);
			sb.reverse();
			
			reverseWord = reverseWord + sb.toString() + " ";
					
		}
		
		System.out.println(reverseWord);
		
	}

}
