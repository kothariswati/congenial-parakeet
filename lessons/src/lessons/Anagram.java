package lessons;

import java.util.*;

public class Anagram {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		// String firstString = input.nextLine().toLowerCase().replace(" ", "");
		// String secondString = input.nextLine().toLowerCase().replace(" ", "");
		// input.close();

		isAnagram("How Are you", "We hoar you");
		isAnagram("The wall is white", "this white walle");
		isAnagram("SILENT", "listen");
		isAnagram("SiX Flags", "fix glass");

	}

	public static void isAnagram(String inp1, String inp2) {
		inp1 = inp1.toLowerCase().replace(" ", "");
		inp2 = inp2.toLowerCase().replace(" ", "");
		if (inp1.length() == inp2.length()) {

			Map<Character, Integer> map1 = new HashMap<Character, Integer>();
			Map<Character, Integer> map2 = new HashMap<Character, Integer>();

			for (int i = 0; i < inp1.length(); i++) {
				if (map1.containsKey(inp1.charAt(i)))
					map1.put(inp1.charAt(i), map1.get(inp1.charAt(i)) + 1);
				else
					map1.put(inp1.charAt(i), 1);

				if (map2.containsKey(inp2.charAt(i)))
					map2.put(inp2.charAt(i), map2.get(inp2.charAt(i)) + 1);
				else
					map2.put(inp2.charAt(i), 1);
			}

			// System.out.println(map1);
			// System.out.println(map2);
			if (map1.equals(map2))
				System.out.println("The two inputs are anagrams");
			else
				System.out.println("The two inputs are not anagrams");
		} else
			System.out.println("The two inputs are not anagrams");
	}
}
