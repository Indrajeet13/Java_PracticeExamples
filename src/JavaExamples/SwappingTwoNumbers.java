package JavaExamples;

public class SwappingTwoNumbers {

	public static void main(String[] args) 
	{
		int a=20, b=30;
		
		System.out.println("Before swapping values..."+a+"  " +b);
		
		// Logic 1 - Third variable
		
		int c=a;
		a=b;
		b=c;
		
		System.out.println("After swapping values..."+a+"  " +b);
		
		// Logic 2 - use + & - without using third variable
		
		a = a+b;	//20+30 = 50
		b = a-b;	//50-20 = 30
		a = a-b; 	//50-30 = 20
				
				
				
	}

}
