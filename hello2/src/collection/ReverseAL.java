package collection;

import java.util.ArrayList;
import java.util.Collections;

public class ReverseAL {

	public static void main(String[] args) {
		ArrayList<Integer> a = new ArrayList<Integer>();
		a.add(5);
		a.add(1);
		a.add(3);
		a.add(2);
		a.add(6);
		a.add(-1);
		Collections.reverse(a);
		System.out.println(a);
	}

}
