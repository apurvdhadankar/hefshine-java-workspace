package collection;

import java.util.ArrayList;

public class RemoveElementAL {

	public static void main(String[] args) {
		ArrayList<Integer> a = new ArrayList<Integer>();
		a.add(1);
		a.add(2);
		a.add(3);
		a.add(4);
		a.add(5);
		a.add(6);
		a.set(3, 80);
		a.remove(2);
		System.out.println(a);
	}

}
