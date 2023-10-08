package set;

import java.util.HashSet;
import java.util.Iterator;

public class AppendAtLast {

	public static void main(String[] args) {
		HashSet<Integer> a = new HashSet<Integer>();
		a.add(5);
		a.add(6);
		a.add(6);
		a.add(7);
		a.add(8);
		a.add(8);
		Iterator<Integer> i = a.iterator();
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
	}
}
