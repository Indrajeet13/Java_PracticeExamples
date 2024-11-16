package JavaExamples;

import java.util.Scanner;

public class FindVowelsOnString {

	public static void main(String[] args) 
	{
		
		System.out.println("Enter the String ...");
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		System.out.println("The Vowels available in Strings are : ");
		for(int i=0;i<str.length()-1;i++)
		{
			if(str.charAt(i)=='a' || str.charAt(i)=='e' ||str.charAt(i)=='i' || str.charAt(i)=='o' || str.charAt(i)=='u' || str.charAt(i)=='A' || str.charAt(i)=='E' ||str.charAt(i)=='I' || str.charAt(i)=='O' || str.charAt(i)=='U')
			{
				System.out.print(str.charAt(i));
			}
		}
		
		
		
	}

}
