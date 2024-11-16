package JavaExamples;

import java.util.Arrays;

//Case 1 : Key = Mid
//Case 2 : Key>Mid L=MID+1	//L - Lower
//Case 3 : Key<Mid H=MID-1	//H - Higher

public class BinarySearchAlgorithm {

	public static void main(String[] args) 
	{
		
		
		int a[] = {1,2,3,4,5,6,7,8,9,10};	//Elements should be in sorted orderSs
		
		/*
	//Approch 1
		
		boolean flag = false;
		
		int key=5;
		int l=0, h = a.length-1;
		
		while(l<=h)
		{
			int mid =(l+h)/2;
			
			if(a[mid]==key)
			{
				System.out.println("Element Found...");
				flag = true;
				break;
			}
			
			if(a[mid]<key)
			{
				l=mid+1;
			}

			if(a[mid]<key)
			{
				h=mid-1;
			}
		}
		
		if(flag==false)
		{
			System.out.println("Element NOT Found");
		}
		*/
	//Approch 2: Arrays.binarySearch();
		
		System.out.println(Arrays.binarySearch(a, 8));
		
		
	}

}
