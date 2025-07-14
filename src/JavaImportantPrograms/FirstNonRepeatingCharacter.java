package JavaImportantPrograms;

//Find first non-repeating character
public class FirstNonRepeatingCharacter {

	public static void main(String[] args) {
		
		String str = "Amazon";	//The string should be in uppercase or lowercase
		String strLowerCase = str.toLowerCase();
		
		for(int i = 0; i < strLowerCase.length(); i++) 
		{
			boolean unique = true;
			for(int j = 0; j < strLowerCase.length(); j++) 
			{
				if(i != j && strLowerCase.charAt(i) == str.charAt(j)) 
				{
					unique = false;
					break;
				}
				
			}
			if(unique) {
				System.out.println(strLowerCase.charAt(i));
				break;
			}
		}
		
	}
		
}

