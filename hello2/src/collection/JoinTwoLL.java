package collection;

import java.util.LinkedList;

public class JoinTwoLL {

	public static void main(String[] args) {
		LinkedList<Integer> a = new LinkedList<Integer>();
		a.add(1);
		a.add(2);
		a.add(3);
		a.add(4);
		a.add(5);
		a.add(6);
		LinkedList<Integer> b = new LinkedList<Integer>();
		b.add(7);
		b.add(8);
		b.add(9);
		b.add(10);
		b.add(12);
		b.add(13);
		
		a.addAll(b);
		System.out.println(a);

	}

}
