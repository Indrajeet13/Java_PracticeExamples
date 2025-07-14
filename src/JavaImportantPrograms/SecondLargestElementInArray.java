package JavaImportantPrograms;

public class SecondLargestElementInArray {

	public static void main(String[] args) {

		int[] arr = {12, 35, 1, 10, 34, 1};
		
		if(arr.length < 2) {
			System.out.println("Array should have at least two elements ");
			return;
		}
		
		int largest = arr[0];
		int secondLargest = 0;
		
		for(int i=1; i<arr.length;i++) {	//	1 
			if(arr[i] > largest) {	// 35>12 
				secondLargest = largest;	//secondLargest =  12 
				largest = arr[i];			//largest 		= 12 
			}else if(arr[i] > secondLargest && arr[i] != largest) {
				secondLargest = arr[i];
			}
		}
		System.out.println(secondLargest);
		
	}

}
