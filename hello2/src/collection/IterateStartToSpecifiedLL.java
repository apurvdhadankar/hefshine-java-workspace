package collection;

import java.util.LinkedList;

public class IterateStartToSpecifiedLL {

	public static void main(String[] args) {
		LinkedList<Integer> a = new LinkedList<Integer>();
//		a.add(1);
//		a.add(2);
//		a.add(3);
//		a.add(4);
//		a.add(5);
//		a.add(6);
//		a.add(7);
//		a.add(8);
		for(int i=1; i<12; i++)
		{
			a.add(i);
		}
		System.out.println(a);
		
		for(int i=0; i<a.indexOf(5); i++)
		{
			System.out.println(a.get(i));
		}
		

	}

}
