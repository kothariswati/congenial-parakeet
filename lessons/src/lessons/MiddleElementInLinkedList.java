package lessons;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Set;
import java.util.TreeSet;

public class MiddleElementInLinkedList {

	public static void main(String[] args) {

		LinkedList<Integer> ll = new LinkedList<Integer>(Arrays.asList(2, 5, 7, 4));
		ListIterator li1 = ll.listIterator();
		ListIterator li2 = ll.listIterator();

		while (li1.hasNext()) {
			if (li2.hasNext())
				li2.next();
			else
				break;
			if (li2.hasNext())
				li2.next();
			else
				break;
			li1.next();

		}
		System.out.println(li1.next());

	}
}
