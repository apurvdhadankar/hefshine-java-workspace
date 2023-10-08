package collection;

import java.util.ArrayList;
import java.util.Iterator;

public class ALPrintUsingIterator {

	public static void main(String[] args) {
		ArrayList<Integer> a = new ArrayList<Integer>();
		a.add(30);
		a.add(3);
		a.add(15);
		a.add(1);
		a.add(2);
		a.add(8);
		a.add(15);
		a.add(21);
		Iterator<Integer> b = a.iterator();
		while(b.hasNext())
		{
			System.out.println(b.next());
		}

	}

}
