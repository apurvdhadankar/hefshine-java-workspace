package set;

import java.util.HashSet;
import java.util.LinkedList;

public class AppendAtSpecifiedElementHS {

	public static void main(String[] args) {
		HashSet<Integer> a = new HashSet<Integer>();
		a.add(1);
		a.add(2);
		a.add(3);
		a.add(4);
		a.add(5);
		a.add(6);
		LinkedList<Integer> b= new LinkedList<Integer>(a);
		b.add(1, 20);
		HashSet<Integer> new1 = new HashSet<Integer>(b);
		System.out.println(new1);
	}

}
