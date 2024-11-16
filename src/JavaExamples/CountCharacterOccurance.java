package JavaExamples;

public class CountCharacterOccurance {

	public static void main(String[] args) 
	{
		String s= "Java Programming Selenium Automation";
		
		int totalCount = s.length();
		
		int totalCount_afterRemove_a = s.replace("a", "").length();	//Total length after removing 'a'
		
		int count = totalCount - totalCount_afterRemove_a;
		
		System.out.println("Number of Occurance os a is : "+count);
	}

}
