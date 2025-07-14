package JavaImportantPrograms;


//Print the fibonacci series - 0 1 1 2 3 5 8 13 21
public class FibonacciSequence {

	public static void main(String[] args) {
		
		int num = 10;
		int firstNum = 0, secondNum = 1;
		
		System.out.print(firstNum +" "+secondNum+" ");	//0 1 
		
		for(int i=2; i<num; i++) {
			
			int nextNum = firstNum + secondNum;	//nextNum = 1  2 3 5 8 13
			System.out.print(nextNum+" ");
			firstNum = secondNum;	//firstNum = 1 1 2 3 5
			secondNum = nextNum;	//secondNum = 1 2 3 5 8 
			
			
		}

	}

}
