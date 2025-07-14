package JavaImportantPrograms;

public class StringCharacterCountV2 {

	public static void main(String[] args) {
		
//		String str = "cbbcccceedaaa"; // Expected Output: c5b2e2d1a3
//
//        int[] freq = new int[26]; // For a-z
//
//        for (int i = 0; i < str.length(); i++) {
//            freq[str.charAt(i) - 'a']++;
//        }
//
//        // Print in the order of first appearance
//        boolean[] printed = new boolean[26];
//
//        for (int i = 0; i < str.length(); i++) {
//            
//        	char ch = str.charAt(i);
//            int index = ch - 'a';
//            
//            if (!printed[index]) {
//                System.out.print(ch + "" + freq[index]);
//                printed[index] = true;
//            }
//        }
		
		String str = "aA1#bBcC";
        int[] freq = new int[256]; // 256 covers all ASCII characters
 
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            freq[ch]++; // char is implicitly converted to its ASCII value
        }
 
        // Print frequencies
        for (int i = 0; i < 256; i++) {
            if (freq[i] > 0) {
                System.out.println((char)i + ": " + freq[i]);
            }
        }

	}

}
