package collection;

import java.util.LinkedList;

public class CloneLL {

	public static void main(String[] args) {
		LinkedList<Integer> a = new LinkedList<Integer>();
		a.add(1);
		a.add(2);
		a.add(3);
		a.add(4);
		a.add(5);
		a.add(6);
		
		LinkedList<Integer> b = new LinkedList<Integer>();
		for(int i=0; i<a.size(); i++)
		{
			b.add(i, a.get(i));
			System.out.print(b.get(i));
		}
		
		
		
	}

}
