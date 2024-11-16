package JavaExamples;

import java.util.Scanner;

public class PalindromeString {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String : ");
		
		String str = sc.next();
		String org_str = str;
		
		int len = str.length();		
		String rev = "";
		
		for(int i=len-1;i>=0;i--)		
		{
			rev = rev + str.charAt(i);
		}
		
		System.out.print(rev);
		
		if(org_str.equals(rev))
		{
			System.out.println("\tString is palindrome ..");
		}
		else
		{
			System.out.println("\tString is not palindrome ..");
		}
		
	}

}
