package JavaImportantPrograms;

//Remove duplicates from String
public class RemoveDuplicatesFromString {

	public static void main(String[] args) {
		
		String str = "indiaa";
		String newStr = "";
		
		for(int i=0; i<str.length();i++) {
			boolean isDuplicate = false;
			
			for(int j=0;j<str.length();j++) {
				
				if(i!=j && str.charAt(i) == str.charAt(j)) {
					isDuplicate = true;
					break;
				}
			}
			if(!isDuplicate) {
				newStr = newStr + str.charAt(i);
			}
		}
		System.out.println(newStr);
	
	}
}
