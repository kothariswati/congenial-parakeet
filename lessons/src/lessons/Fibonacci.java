package lessons;

import java.util.*;

public class Fibonacci {
	static int a = 0, b = 1, result = 0;

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		int fiboLength = input.nextInt();
		System.out.print(a + " " + b+" ");
		fiboRecursive(fiboLength-2);

	}

	public static void fiboRecursive(int fiboLength) {
		if (fiboLength > 0) {
			
			result = a + b;
			a = b;
			b = result;
			System.out.print(result+" ");
			fiboRecursive(fiboLength - 1);

		}
	}

}
