package WeekDay2ndweekworkout;

public class PalindromeString {

	public static void main(String[] args) {
		String str = "madam";
		String revstr = "";

		int size = str.length();

		for (int i = (size - 1); i >= 0; i--) {

			revstr += str.charAt(i);
		}
		if (str.toLowerCase().equals(revstr.toLowerCase())) {
			System.out.println(str + " is Palindrome");
		} else {
			System.out.println(str + " Not a Palidrome");
		}

		// Build a logic to find the given string is palindrome or not

		/*
		 * Pseudo Code
		 * 
		 * a) Declare A String value as"madam"
		 * 
		 * b) Declare another String rev value as "" c) Iterate over the String in
		 * reverse order d) Add the char into rev e) Compare the original String with
		 * the reversed String, if it is same then print palinDrome
		 * 
		 * Hint: Use .equals or .equalsIgnoreCase when you compare a String
		 */
	}

}
