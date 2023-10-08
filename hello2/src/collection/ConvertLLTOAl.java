package collection;

import java.util.ArrayList;
import java.util.LinkedList;

public class ConvertLLTOAl {

	public static void main(String[] args) {
		LinkedList<Integer> a = new LinkedList<Integer>();
		a.add(1);
		a.add(2);
		a.add(3);
		a.add(4);
		a.add(3);
		a.add(6);
		
		ArrayList<Integer> b = new ArrayList<Integer>(a);
//		b.addAll(a);
		System.out.println(b);

	}

}
