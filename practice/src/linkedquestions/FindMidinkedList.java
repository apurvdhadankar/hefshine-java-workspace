package linkedquestions;

import java.util.LinkedList;
import java.util.ListIterator;

public class FindMidinkedList {

	public static void main(String[] args) {
		LinkedList<Integer> ll = new LinkedList<>();
		ll.add(10);
		ll.add(20);
		ll.add(30);
		ll.add(40);
		ll.add(50);
		ll.add(50);		ll.add(50);
		
		int cnt=0;
		ListIterator<Integer> s = ll.listIterator();
		while(s.hasNext())
		{
			s.next();
			cnt++;
		}
		int mid=0;
		mid  = cnt/2;
		System.out.println(ll.get(mid));
		
		
	}

}
