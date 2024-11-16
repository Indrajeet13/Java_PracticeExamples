package JavaExamples;

import java.util.Scanner;

public class PalindromeNumber {

	public static void main(String[] args) 
	{
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number : ");
		
		int num = sc.nextInt();
		int orgNum = num;
		int rev = 0;
		
		while(num!=0)
		{
			rev = rev*10 + num%10;	//0+1 =1 // 1*10+1= 11 	// 11*10+3=113 //113*10+5=1135 //1135*10+5=11355
			num = num /10;
			
		}
		System.out.println("Reveser Number :"+rev);
		
		if(orgNum==rev)
		{
			System.out.println("Number is palindrome ..");
		}
		else
		{
			System.out.println("Number is not palindrome ..");
		}
	}

}
