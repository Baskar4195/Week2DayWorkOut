package WeekDay2ndweekworkout;

import java.util.Arrays;

public class Anagramarrayvalues {

	public static void main(String[] args) {
		
		String text1 ="stops";
		String text2 = "potss";
		
		if (text1.length() == text2.length()) {
		char [] word1 = text1.toCharArray();
		char [] word2 = text2.toCharArray();
		Arrays.sort(word1);
		Arrays.sort(word2);
		boolean Matchlength = Arrays.equals(word1, word2);
		if (Matchlength) {
			System.out.println(text1 + "and" + text2 + " are Anagram");
		} else {
			System.out.println(text1 + "and" + text2 + " are not an Anagram");
		}
		}
		/*
		 * Pseudo Code
		  
		 *Declare a String 
			String text1 = "stops";
		 *Declare another String
			String text2 = "potss"; 
		 * a) Check length of the strings are same then (Use A Condition)
		 * b) Convert both Strings in to characters
		 * c) Sort Both the arrays
		 * d) Check both the arrays has same value
		 * 
		 */
	}

}
