package collection;

import java.util.LinkedList;

public class InsertAtSpecifiedLL {

	public static void main(String[] args) {
		LinkedList<Integer> a = new LinkedList<Integer>();
		a.add(1);
		a.add(2);
		a.add(3);
		a.add(4);
		a.add(5);
		a.add(6);
		a.add(2, 200);
		System.out.println(a);
	}

}
