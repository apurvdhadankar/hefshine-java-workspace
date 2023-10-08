package collection;

import java.util.LinkedList;

public class AppendSpecifiedToLL {

	public static void main(String[] args) {
		LinkedList<Integer> s = new LinkedList<Integer>();
		s.add(1);
		s.add(2);
		s.add(3);
		s.add(4);
		s.add(5);
		s.add(6);
		s.addLast(51);
		System.out.println(s);

	}

}
