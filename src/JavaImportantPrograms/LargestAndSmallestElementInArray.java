package JavaImportantPrograms;

//Find largest and smallest value in the array
public class LargestAndSmallestElementInArray {

	public static void main(String[] args) {
		
		int arr[] = {1,3,4,5,9,3,2};
		int largest = arr[0];
	    int smallest = arr[0];
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i] > largest) {
				largest = arr[i];
			}
			if(arr[i] < smallest) {
				smallest = arr[i];
			}
		}
		System.out.println(	"Largest Value in array is: "+largest + 
							"\nSmallest value in array is : "+smallest);

	}

}
