package JavaImportantPrograms;

//Count the characters in String
public class CountCharacterInString {

	public static void main(String[] args) {
		
		String str = "Welcome to India";
		int cnt = 0;
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)!=' ') {
				cnt++;
			}
		}
		System.out.println(cnt);

	}

}
