package lessons;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.ListIterator;

public class CheckLoopInLinkedList {

	public static void main(String[] args) {
		LinkedList<Integer> intlist = new LinkedList<Integer>(Arrays.asList(1, 2, 7, 5, 8, 9));
		ListIterator li = intlist.listIterator();
		System.out.println(intlist.toString());
	}

}
