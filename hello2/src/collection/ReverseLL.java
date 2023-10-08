package collection;

import java.util.Collections;
import java.util.LinkedList;

public class ReverseLL {

	public static void main(String[] args) {
		LinkedList<Integer> a = new LinkedList<Integer>();
		for(int i=1; i<12; i++)
		{
			a.add(i);
		}
		System.out.println(a);
		Collections.reverse(a);
		System.out.println("Reverse: " +a);
	}

}
