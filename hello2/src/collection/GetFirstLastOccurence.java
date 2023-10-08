package collection;

import java.util.LinkedList;

public class GetFirstLastOccurence {

	public static void main(String[] args) {
		LinkedList<Integer> a = new LinkedList<Integer>();
		a.add(1);
		a.add(2);
		a.add(3);
		a.add(4);
		a.add(3);
		a.add(6);
		System.out.println(a.indexOf(3));
		System.out.println(a.lastIndexOf(3));

	}

}
