package JavaExamples;

public class EvenOddFromArray {

	public static void main(String[] args) 
	{
		int a[] = {2,5,4,7,9,6};
		
		int even = 0, odd = 0;
		
		//Extrating even numbers..
		
		System.out.println("Even Numbers in array...");
		for(int i=0;i<a.length;i++)
		{
			if(a[i]%2==0)
			{
				System.out.print(a[i]+" ");
			}
		}
		
		System.out.println("\nEnhanced For loop..");
		
		for(int value:a)
		{
			if(value%2==0)
			{
				System.out.print(value+" ");
			}
		}
		
		//Extrating odd numbers..
		
		System.out.println("\nOdd Numbers in array...");
		for(int i=0;i<a.length;i++)
		{
			if(a[i]%2!=0)
			{
				System.out.print(a[i]+" ");
			}
		}
		
		System.out.println("\nEnhanced For loop..");
		for(int value:a)
		{
			if(value%2!=0)
			{
				System.out.print(value+" ");
			}
		}
		
		
		
	}

}
