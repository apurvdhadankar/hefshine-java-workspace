package collection;

import java.util.ArrayList;

public class JoinTwoAL {

	public static void main(String[] args) {
		ArrayList<Integer> a = new ArrayList<Integer>();
		a.add(5);
		a.add(1);
		a.add(3);
		a.add(2);
		a.add(6);
		a.add(-1);

		
		ArrayList<Integer> b = new ArrayList<Integer>();
		b.add(50);
		b.add(10);
		b.add(30);
		b.add(50);
		b.add(60);
		b.add(-100);
		b.addAll(a);
		System.out.println(b);
		
		
	}

}
