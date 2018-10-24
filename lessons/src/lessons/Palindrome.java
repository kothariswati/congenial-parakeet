package lessons;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String pal = "aninliliililpp";
		int longest = 0;
		String longest_pal = "";

		for (int beginIndex = 0; beginIndex < pal.length(); beginIndex++) {

			for (int endIndex = 1; endIndex <= pal.length(); endIndex++) {
				// System.out.println("pal.length()" +i);
				if (beginIndex < endIndex) {
					String teststr = pal.substring(beginIndex, endIndex);

					boolean result = isPalindrome(teststr);
					if (result && teststr.length() > longest) {
						longest = teststr.length();
						longest_pal = teststr;

					}
					//System.out.println("result is " + result + " for string " + teststr);
				}
			}
		}
		System.out.println("longest palindrome is " + longest_pal);
	}

	public static boolean isPalindrome(String pal) {
		// System.out.println("pal " +pal);
		StringBuffer s1 = new StringBuffer();
		s1 = s1.append(pal);
		// StringBuffer s1_reverse = new StringBuffer();
		// System.out.println("string s1 " +s1);
		s1.reverse();

		if (pal.equals(s1.toString())) {
			return true;
		} else {
			return false;
		}
	}

}
