package JavaExamples;

public class RemoveJunkFromString {

	public static void main(String[] args) 
	{
		String s = "\\.[]{}()<>*+-=!?^$|@##@$%&& latin string 1235545";
		
		s = s.replaceAll("[^a-zA-Z0-9]", "");
		
		System.out.println(s);
		
	}

}
