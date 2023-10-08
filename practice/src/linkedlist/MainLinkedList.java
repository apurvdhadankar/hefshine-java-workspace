package linkedlist;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

public class MainLinkedList {

	public static void main(String[] args) {
		MyLinkedList ll = new MyLinkedList();
		ll.add(10);
		ll.add(20);
		ll.add(30);
		ll.add(40);
		ll.add(50);
		ll.add(60);
		
		ll.print();
		
		System.out.println(ll.find(50));
		

	}

}
