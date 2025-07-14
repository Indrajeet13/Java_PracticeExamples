package JavaImportantPrograms;

public class PalindromeNumber {

	public static void main(String[] args) {
		
		int num = 112232211, rev = 0;;
		int oriNum = num;
		while(num!=0) {
			rev = rev*10 + num%10;
			num = num/10;
		}
		
		if(oriNum == rev) {
			System.out.println("It is the Palindrime Number");
		}else {
			System.out.println("It is not a Palindrime Number");
		}
	}

}
