package arrays;

import java.util.ArrayList;

public class Difference {

	public static void main(String[] args) {
		int[] a = {3,1,5};
		int[] b = {5,6,7};
		
		ArrayList<Integer> al = new ArrayList<>();
		for (int i = 0; i < a.length; i++) 
		{
			for (int j = 0; j < b.length; j++) 
			{
				int x = a[i]-b[j];
				x = Math.abs(x);
				al.add(x);
			}
			
			
		}
		System.out.println(al);

	}

}
