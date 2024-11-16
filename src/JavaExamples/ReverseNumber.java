package JavaExamples;

import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) 
	{
		// 1. Using algorithm
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number : ");
		
		int num = sc.nextInt();
		int rev = 0;
		
		while(num!=0)
		{
			rev = rev*10 + num%10;	//0+1 =1 // 1*10+1= 11 	// 11*10+3=113 //113*10+5=1135 //1135*10+5=11355
			//System.out.print(num%10);
			num = num /10;
			
		}
		System.out.println("\tReveser Number :"+rev);
		
		
	}

}
