package JavaImportantPrograms;


//Reverse a String
public class ReverseString {

	public static void main(String[] args) {
		
		String str = "Automation";
		for(int i=str.length()-1;i>=0;i--) {
			System.out.print(str.charAt(i));
		}

	}

}
