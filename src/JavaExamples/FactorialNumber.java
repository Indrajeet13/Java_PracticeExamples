package JavaExamples;

//5! = 1 * 2 * 3 * 4 * 5 = 120

public class FactorialNumber {

	public static void main(String[] args) 
	{
		int num = 5;
		
		long fact=1;
		
		for(int i=1;i<=num;i++)
		{
			fact = fact*i;
		}
		System.out.println("Factorial Number is : "+fact);

	}

}
