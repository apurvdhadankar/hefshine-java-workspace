package pre1;

import java.util.Collections;
import java.util.LinkedList;

public class Q8C {

	public static void main(String[] args) {
		LinkedList<Integer> ll = new LinkedList<Integer>();
		ll.add(1);
		ll.add(2);
		ll.add(3);
		ll.add(4);
		ll.add(5);
		Collections.shuffle(ll);
		System.out.println(ll);

	}

}
