package set;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.TreeSet;

public class ReverseTree {

	public static void main(String[] args) {
		TreeSet<Integer> a = new TreeSet<Integer>();
		a.add(1);
		a.add(2);
		a.add(3);
		a.add(4);
		System.out.println(a);
		ArrayList<Integer> b = new ArrayList<Integer>(a);
		for (int i = 0; i < b.size()/2; i++) 
		{
			Integer p = b.get(i);
			Integer q = b.get(b.size()-1-i);
			b.set(i, q);
			b.set(b.size()-1-i, p);
		}
		System.out.println(b);
	
		
		
	}

}
