package lessons;

public class FindTypeOfNumber {

	public static void main(String[] args) {
		FindTypeOfNumber typeofnumber = new FindTypeOfNumber();
		Boolean result = typeofnumber.IsInteger("79.00");

		if (result)
			System.out.println("The entered string is an integer");
		else
			System.out.println("The entered string is not an integer");

		result = typeofnumber.IsOddNumber("790");

		if (result)
			System.out.println("The entered number is an odd number");
		else
			System.out.println("The entered number is not an odd number");

		result = typeofnumber.IsEvenNumber("790");

		if (result)
			System.out.println("The entered number is an even number");
		else
			System.out.println("The entered number is not an even number");

		result = typeofnumber.IsPrimeNumber("2");

		if (result)
			System.out.println("The entered number is a prime number");
		else
			System.out.println("The entered number is not a prime number");
	}

	public Boolean IsInteger(String str) {

		try {
			int test = Integer.parseInt(str);

		} catch (NumberFormatException e) {
			return false;
		}
		return true;

	}

	public Boolean IsOddNumber(String str) {

		if (IsInteger(str)) {
			if (Integer.parseInt(str) % 2 == 1) {
				return true;
			}
		}
		return false;

	}

	public Boolean IsEvenNumber(String str) {
		if (IsInteger(str)) {
			if (Integer.parseInt(str) % 2 == 0) {
				return true;
			}
		}
		return false;
	}

	public Boolean IsPrimeNumber(String str) {
		if (IsInteger(str)) {
			if (Integer.parseInt(str) == 1 || Integer.parseInt(str) == 2 || Integer.parseInt(str) == 3) {
				return true;
			}

			if (IsOddNumber(str)) {
				for (int i = 3; i <= Integer.parseInt(str) / 2; i++) {
					if (Integer.parseInt(str) % i == 0) {
						return false;
					}
				}
				return true;
			}

		}
		return false;
	}

}