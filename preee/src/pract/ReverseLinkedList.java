package pract;

import java.util.Collections;
import java.util.LinkedList;

public class ReverseLinkedList {

	public static void main(String[] args) {
		LinkedList<Integer> ll = new LinkedList<>();
		ll.add(10);
		ll.add(20);
		ll.add(30);
		ll.add(40);
		ll.add(50);
		
		
		Collections.reverse(ll);
		
		
		System.out.println(ll);
	}

}
