package JavaExamples;

import java.util.Arrays;

public class BubbleSort {

	public static void main(String[] args) 
	{
		int a[] = {1,4,3,8,6,5};
		
		System.out.println("Array before sorting : "+Arrays.toString(a));
		
		int n = a.length;
		
		for(int i=0;i<n-1;i++)	//Number of passes
		{
			for(int j=0;j<n-1;j++)	//Iterations in each pass
			{
				if(a[j]>a[j+1])
				{
					int temp = a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
			}
		}
		
		System.out.println("Array After sorting : "+Arrays.toString(a));
		
	}

}
