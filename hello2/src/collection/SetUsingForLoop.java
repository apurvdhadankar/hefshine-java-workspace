package collection;

import java.util.HashSet;
import java.util.Set;

public class SetUsingForLoop {

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
		for(int p:s)
		{
			System.out.println(p);
		}
	}

}
