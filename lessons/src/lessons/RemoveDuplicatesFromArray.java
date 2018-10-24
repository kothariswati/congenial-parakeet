package lessons;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.stream.IntStream;

public class RemoveDuplicatesFromArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Integer[] strarray = new Integer[] { 3, 5,2, 7, 1, 3, 9,1,2 };

		Set<Integer> intset = new LinkedHashSet<Integer>();
		Collections.addAll(intset, strarray);
		
		System.out.println(intset);
		
		

	}

}
