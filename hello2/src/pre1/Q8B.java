package pre1;

import java.util.Collections;
import java.util.LinkedList;

public class Q8B {

	public static void main(String[] args) {
		LinkedList<Integer> ll = new LinkedList<Integer>();
		ll.add(1);
		ll.add(2);
		ll.add(3);
		ll.add(4);
		ll.add(5);
//		Collections.reverse(ll);
//		System.out.println(ll);
		for (int i = ll.size()-1; i >= 0; i--) 
		{
			System.out.print(ll.get(i)+" ");
		}
	}

}
