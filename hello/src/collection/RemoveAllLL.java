package collection;

import java.util.LinkedList;

public class RemoveAllLL {

	public static void main(String[] args) {
		LinkedList<Integer> a = new LinkedList<Integer>();
		a.add(1);
		a.add(2);
		a.add(3);
		a.add(4);
		a.add(3);
		a.add(6);
		a.clear();
		System.out.println(a);

	}

}
