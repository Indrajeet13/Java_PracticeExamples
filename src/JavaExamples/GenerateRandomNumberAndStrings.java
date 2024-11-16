package JavaExamples;

import java.util.Random;

import org.apache.commons.lang3.RandomStringUtils;

public class GenerateRandomNumberAndStrings {

	public static void main(String[] args) 
	{
		
		//Approch 1 - Random
		
		Random rand = new Random();
		
		int randInt = rand.nextInt(100);
		System.out.println(randInt);
		
		double randDbl= rand.nextDouble();	//range 0.0 and less than 1.0
		System.out.println(randDbl);
		
		//Approch 2 - Math class
		
		System.out.println(Math.random());
		
		
		//Approch 3 - Apache Common lang API
		
		String randNum = RandomStringUtils.randomNumeric(10);
		System.out.println(randNum);
		
		String randString = RandomStringUtils.randomAlphabetic(5);
		System.out.println(randString);
	}

}
