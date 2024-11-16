package JavaExamples;

public class MaxAndMinElementInArray {

	public static void main(String[] args) 
	{
		int a[] = {10,50,30,20,60};
		
		int max = a[0];	//10
		
		for(int i=1;i<a.length;i++)
		{
			if(a[i]>max) //50>10 50>30 50>20 50>60
			{
				max = a[i];	//50 60
			}
		}
		
		System.out.println("Maximum Element in Array is : "+max);
		
		int min = a[0];	//10
		
		for(int i=1;i<a.length;i++)
		{
			if(a[i]<min) //50<10 30<10 20<10 60<10
			{
				min = a[i];	//10 
			}
		}
		
		System.out.println("Minimum Element in Array is : "+min);
	}

}
