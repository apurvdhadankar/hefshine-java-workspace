package collection;

import java.util.*;

public class SetPrintUsingIterator {

	public static void main(String[] args) {
		Set<Integer> s = new HashSet<Integer>();
		s.add(10);
		s.add(50);
		s.add(12);
		s.add(13);
		s.add(14);
		s.add(18);
		s.add(20);
		s.add(30);
		Iterator<Integer> b = s.iterator();
		while(b.hasNext())
		{
			System.out.println(b.next());
		}

	}

}
