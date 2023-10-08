package collection;

import java.util.LinkedList;

public class ElementExistOrNotInLL {

	public static void main(String[] args) {
		LinkedList<Integer> a = new LinkedList<Integer>();
		a.add(1);
		a.add(2);
		a.add(3);
		a.add(4);
		a.add(3);
		a.add(6);
		int n=3;
//		System.out.println(a.contains(n));
		for(int i=0 ;i<a.size(); i++)
		{
			if(a.get(i)==n)
			{
				System.out.println("Already Exist");
			}
		}
	}

}
