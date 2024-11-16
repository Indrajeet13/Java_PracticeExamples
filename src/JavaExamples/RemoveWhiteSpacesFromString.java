package JavaExamples;

public class RemoveWhiteSpacesFromString {

	public static void main(String[] args) 
	{
		String str = "Java    Programming  Selenium   Automation";
		
		System.out.println("Before Removing White spaces : "+str);
		
		str = str.replaceAll("\\s", "");
		
		System.out.println("After Removing White spaces : "+str);
	}

}
