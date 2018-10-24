package lessons;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class FirstRepeatedCharacter {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		char[] inputStringToCharArray = input.nextLine().toCharArray();

		Map<Character, Integer> lhm = new LinkedHashMap<Character, Integer>();
		Integer i = 1;
		for (char ch : inputStringToCharArray) {

			if (lhm.containsKey(ch)) {
				System.out.println("First repeated character is.." + ch);
				break;
			} else
				lhm.put(ch, i);
		}

	}

}
