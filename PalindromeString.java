package StringExcersize;

public class PalindromeString {

	public static boolean isPalindrome(String input) {

		StringBuffer sb = new StringBuffer(input);

		sb.reverse();

		String reverseString = new String(sb);

		return input.equalsIgnoreCase(reverseString);

	}

	public static void main(String[] args) {

		String input = "MADAM";
		String output = "";

		if (isPalindrome(input)) {

			output = "Word is Palindrome";

		} else {

			output = "Word is  not a palindrome";
		}

		System.out.println(output);
	}

}
