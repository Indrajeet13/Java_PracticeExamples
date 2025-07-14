package JavaImportantPrograms;

//Print Character count with the 
public class StringCharacterCount {

	public static void main(String[] args) {
		
		String str = "cbbcccceedaaa"; // Expected Output: a3b2c4e1

		int count = 1;

		for (int i = 1; i < str.length(); i++) {	//
			if (str.charAt(i) == str.charAt(i - 1)) {
				count++;
			} else {
				System.out.print(str.charAt(i - 1) + "" + count);
				count = 1;
			}
		}

		// Print the last character group
		System.out.print(str.charAt(str.length() - 1) + "" + count);
		
	}

}
