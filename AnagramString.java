package StringExcersize;

import java.util.Arrays;

public class AnagramString {

	public static void main(String[] args) {

		String str1 = "god";
		String str2 = "dog";

		if (areAnagrams(str1, str2)) {

			System.out.println(str1 + " and " + str2 + " It is a anagram word! ");
		} else {

			System.out.println(str1 + " and " + str2 + " It is not a anagram word! ");
		}
	}

	private static boolean areAnagrams(String str1, String str2) {

		if (str1.length() != str2.length()) {

			return false;
		}

		char[] charArray1 = str1.toCharArray();
		char[] charArray2 = str2.toCharArray();

		Arrays.sort(charArray1);
		Arrays.sort(charArray2);

		return Arrays.equals(charArray1, charArray2);
	}

}