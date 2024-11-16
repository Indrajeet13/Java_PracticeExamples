package JavaExamples;

import java.util.Scanner;

public class CountEvenAndOddNumbers {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number : ");
		
		int num = sc.nextInt();
		int evenCnt=0, oddCnt = 0;
		
		while(num>0)
		{
			int reminder = num%10;
			
			if(reminder%2==0)
			{
				evenCnt++;
			}
			else
			{
				oddCnt++;
			}
			
			num = num/10;
		}
		
		
		
		System.out.println("Event Count : "+evenCnt+"\t Odd Count : "+oddCnt);
	}

}
