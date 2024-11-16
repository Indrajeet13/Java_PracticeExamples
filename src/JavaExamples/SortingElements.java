package JavaExamples;

import java.util.Arrays;
import java.util.Collections;

public class SortingElements {

	public static void main(String[] args) 
	{
	
	//Approch 1	- Using parallelSort()
		
//		int a[] = {30,50,20,10,60};
//		
//		System.out.println("Array Elements Before Sorting : "+Arrays.toString(a));
//		
//		Arrays.parallelSort(a);
//		System.out.println("Array Elements After Sorting : "+Arrays.toString(a));
		
	//Approch 2	- Using sort();
		
//		int a[] = {30,50,20,10,60};
//		System.out.println("Array Elements Before Sorting : "+Arrays.toString(a));
//		Arrays.sort(a);
//		System.out.println("Array Elements After Sorting : "+Arrays.toString(a));
		
	//Revser order - decending order
		
		Integer a[] = {30,50,20,10,60};
		System.out.println("Array Elements Before Sorting : "+Arrays.toString(a));
		Arrays.sort(a,Collections.reverseOrder());
		System.out.println("Array Elements After Sorting : "+Arrays.toString(a));
		
		
	}

}
