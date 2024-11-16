package JavaExamples;

import java.util.HashSet;

public class DuplicateElementsInArray {

	public static void main(String[] args) 
	{
		String arr[] = {"java", "python", "cpp", "c", "java"};
		
	//Approch 1
		
		boolean flag=false;
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]==arr[j])
				{
					System.out.println("Found the duplicate element : "+arr[i]);
					flag = true;
				}
			}
		}
		if(flag==false)
		{
			System.out.println("Duplicate Element not found :");
		}
		
	//Approch 2 - Using HashSet 
		
		HashSet <String>langs = new HashSet();
		
//		System.out.println(langs.add("Java"));
//		System.out.println(langs.add("Python"));
//		System.out.println(langs.add("Java"));	//False
		
		
		for(String value:arr)
		{
			if(langs.add(value)==false);
			{
				System.out.println("Duplicate Element found : "+value);
				flag = true;
				break;
				
			}
		}
		if(flag==false)
		{
			System.out.println("Duplicate Element not found :");
		}
		
	}

}
