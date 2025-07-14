package JavaImportantPrograms;


//Check if String is Palindrome
public class PalindromeString {

	public static void main(String[] args) {

		String str = "MADAM", temp = "";
		char rev;
		for(int i=str.length()-1;i>=0;i--) {
			rev = str.charAt(i);
			temp = temp + rev;
		}
		
		if(temp.equals(str)) {
			System.out.println(str+ " is Palindrome String");
		}else {
			System.out.println(str+ " is not Palindrome String");
		}
		
		
		
		
		
	}

}
