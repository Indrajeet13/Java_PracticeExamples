package JavaExamples;

import java.util.Date;

public class RandomStringCreation {

	public static void main(String[] args) {
		
		Date date = new Date();
		
//		String dateText = date.toString();
//		String dateTextWithoutSpaces = dateText.replace(" ", "_");
//		String dateTextWithoutColons = dateText.replace(":", "_");
		
		System.out.println(date.toString().replace(" ", "_").replace(":", "_"));

	}

}
