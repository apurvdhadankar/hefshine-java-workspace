package collection;

import java.util.LinkedList;

public class Ass14 {

	public static void main(String[] args) {
		LinkedList<Integer> a = new LinkedList<Integer>();
		a.add(1);
		a.add(2);
		a.add(3);
		a.add(4);
		a.add(3);
		a.add(6);
		for(int i=0; i<a.size(); i++)
		{
			System.out.println("Element Index : "+i+" "+a.get(i));
		}
	}

}
