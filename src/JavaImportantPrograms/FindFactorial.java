package JavaImportantPrograms;

public class FindFactorial {

	public static void main(String[] args) {
		
		int num = 5;
		int fact = 0;
		for(int i=1; i<num ;i++) {
			fact = i*(i+1); 
			System.out.print(fact+"*");
		}
		System.out.println("\nFactorial of number:" + fact);
	}

}
