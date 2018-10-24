package com.swati.util;

public class Calculator {
	private int num1, num2;
	int answer;

	public Calculator() {

	}

	public Calculator(int num1, int num2) {
		super();
		this.num1 = num1;
		this.num2 = num2;
	}

	public float add() {
		return num1 + num2;
	}

	public float subtract() {
		return num1 - num2;
	}

	public float multiply() {
		return num1 * num2;
	}

	public float divide() {
		return num1 / num2;
	}

	public static float modulus() {
		return 1;
	}
}
