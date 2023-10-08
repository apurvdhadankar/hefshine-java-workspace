package collection;

import java.util.LinkedList;

public class RemoveSpecifiedElement {

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
			if(a.get(i)==3)
			{

				a.remove(i);
			}
		}
		System.out.println(a);

	}

}
