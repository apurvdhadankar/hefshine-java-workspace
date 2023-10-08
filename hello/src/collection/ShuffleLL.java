package collection;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

public class ShuffleLL {

	public static void main(String[] args) {
		LinkedList<Integer> ll = new LinkedList<Integer>();
		ll.add(1);
		ll.add(2);
		ll.add(3);
		ll.add(4);
		ll.add(5);
		ll.add(6);
		ll.add(7);
		Collections.shuffle(ll);
		System.out.println(ll);

	}

}
