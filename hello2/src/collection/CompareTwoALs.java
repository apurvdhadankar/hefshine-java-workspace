package collection;

import java.util.ArrayList;

public class CompareTwoALs {

	public static void main(String[] args) {
		ArrayList<Integer> a = new ArrayList<Integer>();
		a.add(5);
		a.add(1);
		a.add(38);
		a.add(22);
		a.add(66);
		a.add(-1);
		System.out.println("Original : "+a);
		
		ArrayList<Integer> b = new ArrayList<Integer>();
		b.add(5);
		b.add(1);
		b.add(38);
		b.add(22);
		b.add(66);
		b.add(-1);
		System.out.println(a.containsAll(b));
		
	}

}
