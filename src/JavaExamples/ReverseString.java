package JavaExamples;

public class ReverseString {

	public static void main(String[] args) 
	{
		String str = "ABCD";
		String rev = "";
		
		//using String concatination
		
		int len = str.length();		
		
		for(int i=len-1;i>=0;i--)		
		{
			System.out.print(str.charAt(i));
		}
				
		System.out.println("\n");
		
		//Using Character Array
		
		char a[] = str.toCharArray();
		
		for(int i=len-1;i>=0;i--)		
		{
			rev = rev+a[i];
		}
		System.out.println(rev);
	}

}
