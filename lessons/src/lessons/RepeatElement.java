package lessons;

import java.util.*;

public class RepeatElement {
	void printRepeating(int arr[])
	/*
	 * { int count[] = new int[size]; int i;
	 * 
	 * System.out.println("Repeated elements are : "); for (i = 0; i < size; i++) {
	 * if (count[arr[i]] == 1) System.out.print(arr[i] + " "); else count[arr[i]]++;
	 * } }
	 */
	{
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		for (int i = 0; i < arr.length; i++) {
			if (map.containsKey(arr[i]))
				System.out.print(arr[i]+"  ");
			else
				map.put(arr[i], 1);
		}
		
	}

	public static void main(String[] args) {
		RepeatElement repeat = new RepeatElement();
		int arr[] = { 4, 2, 4, 5, 2, 3,5,8,9,4,67,67,22,99,3 };
		repeat.printRepeating(arr);
	}
}