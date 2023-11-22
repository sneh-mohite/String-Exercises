package StringExcersize;

public class RemoveWhiteSpaces {

	public static void main(String[] args) {

		String name = "Snehal      Mohite";

		String result = RemoveWhiteSpaces(name);

		System.out.println("Original name: " + name);

		System.out.println("Name after the removing all white spaces: " + result);
	}

	private static String RemoveWhiteSpaces(String name) {

		return name.replaceAll("\\s", "");
	}
}
