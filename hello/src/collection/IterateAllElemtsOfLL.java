package collection;

import java.util.Iterator;
import java.util.LinkedList;

public class IterateAllElemtsOfLL {

	public static void main(String[] args) {
		LinkedList<String> a = new LinkedList<String>();
		a.add("jack");
		a.add("john");
		a.add("selena");
		a.add("ellie");
		a.add("taylor");
		System.out.println("The LL Elements are: ");
//		for(Iterator i=a.iterator(); i.hasNext();)
//		{
//			System.out.println(i.next());
//		}
		for(int i=0; i<a.size(); i++)
		{
			System.out.println(a.get(i));
		}

	}

}
