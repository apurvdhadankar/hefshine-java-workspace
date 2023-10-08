package collection;

import java.util.ArrayList;
import java.util.Iterator;

public class IterateAllElementsOfAL {

	public static void main(String[] args) {
		ArrayList<Integer> a = new ArrayList<Integer>();
		a.add(1);
		a.add(2);
		a.add(3);
		a.add(4);
		a.add(5);
		a.add(6);
		System.out.println("AL Elemets are: ");
		for (int i = 0; i < a.size(); i++) 
		{
			System.out.println(a.get(i));
		}
		System.out.println("using Iterator");
		for(Iterator i=a.iterator(); i.hasNext();)
		{
			System.out.println(i.next());
		}
		
		

	}

}
