package construcorPre;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedIterate {

	public static void main(String[] args) {
		LinkedList it = new LinkedList();
		it.add(1);
		it.add("Kajuu");
		it.add(null);
		it.add(1.7);
		it.add('a');
		it.add(15);
		Iterator i = it.iterator();
		while(i.hasNext())
		{
			System.out.println(i.next());
		}

	}

}
