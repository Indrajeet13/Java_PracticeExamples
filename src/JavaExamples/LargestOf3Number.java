package JavaExamples;

import java.util.Scanner;

public class LargestOf3Number {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Number 1: ");
		int a = sc.nextInt();
		
		System.out.println("Enter Number 2: ");
		int b = sc.nextInt();
		
		System.out.println("Enter Number 3: ");
		int c = sc.nextInt();
		
		//Approch 1 - using logic
		
		if(a>b && a>b)
		{
			System.out.println(a+" is largest number");
		}
		else if(b>a && b>c)
		{
			System.out.println(b+" is largest number");
		}
		else
		{
			System.out.println(c+" is largest number");
		}
		
		//using Ternary operator in java
		
		//int largest = a>b ? a:b;	//Largest of a and b
		//largest = c>largest ? c:largest;
		
		int largest = c>(a>b ? a:b) ? c:(a>b ? a:b);
		
		System.out.println("Largest Number is : "+largest);
		
		
	}

}
