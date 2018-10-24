package lessons;

public class StringReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String inputString = "Hello    World New";
		String inputString_reverse = "";

		inputString_reverse = reverseInput(inputString);
		System.out.println(inputString_reverse);

		inputString_reverse = reverseEachWord(inputString);
		System.out.println(inputString_reverse);

		inputString_reverse = wordsInReverseOrder(inputString);
		System.out.println(inputString_reverse);

		// inputString = inputString.replace(" ", "%20");
		// System.out.println(inputString);
	}

	public static String reverseInput(String input) {
		int lastIndex = input.length() - 1;
		StringBuffer input_reverse = new StringBuffer();

		while (lastIndex >= 0) {
			input_reverse.append(input.charAt(lastIndex));

			lastIndex--;
		}
		return input_reverse.toString();
	}

	public static String reverseEachWord(String input) {

		String[] words = input.split(" ");
		StringBuffer inputString_reverse = new StringBuffer();
		
		for (int i = 0; i < words.length; i++) {
			inputString_reverse.append(reverseInput(words[i])).append(" ");
		}
		return inputString_reverse.toString().trim();
	}

	public static String wordsInReverseOrder(String input) {

		String[] words = input.split(" ");
		StringBuffer inputString_reverse = new StringBuffer();
		String reverse_words = "";

		for (int i = words.length - 1; i >= 0; i--) {
			inputString_reverse.append(words[i]).append(" ");
		}
		return inputString_reverse.toString().trim();
	}
}