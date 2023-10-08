package exceptionHandle;

import java.util.ArrayList;

public class CloneAL {

	public static void main(String[] args) {
		ArrayList<Integer> a = new ArrayList<Integer>();
		a.add(1);
		a.add(2);
		a.add(3);
		a.add(4);
		a.add(5);
		a.add(6);
		
		ArrayList<Integer> b = new ArrayList<Integer>();
		b=(ArrayList<Integer>) a.clone();
		System.out.println(b);
		
		

	}

}
