package StringExcersize;

public class ReplaceCharacter {

	public static String replace(String s) {
		return s.replaceAll("i", "t");
	}

	public static void main(String[] args) {

		String s = "Sofiware";
		String s1 = replace(s);

		System.out.println(s1);
	}

}
