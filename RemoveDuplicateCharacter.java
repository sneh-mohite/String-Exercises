package StringExcersize;

import java.io.PrintStream;

public class RemoveDuplicateCharacter {

	private static Object res;

	public static void main(String[] args) {

		String s = "aaabbccddee";
		String stringWithoutDuplicates = removeDuplicateChar(s);

		System.out.println("Original String is: " + s);

		System.out.println("String without Duplicate: " + stringWithoutDuplicates);
	}

	public static String removeDuplicateChar(String input) {

		StringBuilder res = new StringBuilder();

		for (int i = 0; i < input.length(); i++) {

			char currentChar = input.charAt(i);

			if (!res.toString().contains(String.valueOf(currentChar))) {

				res.append(currentChar);
			}
		}

		return res.toString();
	}

}
