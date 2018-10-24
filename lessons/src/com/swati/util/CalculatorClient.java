package com.swati.util;

import java.util.*;

public class CalculatorClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);

		System.out.println("Please enter the first number ");
		int num1 = input.nextInt();
		System.out.println("Please enter the second number ");
		int num2 = input.nextInt();

		System.out.println("Please enter operation\n1 ADD\n2 SUBTRACT\n3 MULTIPLY\n4 DIVIDE");
		int operation = input.nextInt();
		Float result = (float) 0;
		
		Calculator calc = new Calculator(num1, num2);

		switch (operation) {
		case 1:

			result = calc.add();
			break;
		case 2:
			result = calc.subtract();
			break;
		case 3:
			result = calc.multiply();
			break;
		case 4:
			result = calc.divide();
			break;
		default:
			// none
		}

		System.out.println(result);
	}

}
