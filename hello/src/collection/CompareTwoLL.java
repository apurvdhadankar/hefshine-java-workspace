package collection;

import java.util.LinkedList;

public class CompareTwoLL {

	public static void main(String[] args) {
		LinkedList<Integer> a = new LinkedList<Integer>();
		a.add(1);
		a.add(2);
		a.add(3);
		a.add(4);
		a.add(3);
		a.add(6);
		LinkedList<Integer> b = new LinkedList<Integer>();
		b.add(1);
		b.add(2);
		b.add(3);
		b.add(4);
		b.add(30);
		b.add(6);
		boolean flag=true;
		for (int i = 0; i < a.size(); i++) 
		{
				if(a.get(i)!=b.get(i))
				{
					flag = false;
					break;
				}
		}
		if(flag)
		{
			System.out.println("Same");
		}
		else
		{
			System.out.println("False");
		}

	}

}
