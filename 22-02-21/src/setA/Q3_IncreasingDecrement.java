package setA;

import java.util.ArrayList;

public class Q3_IncreasingDecrement {

	public static void main(String[] args) {
		int[] a = {5,1,3,6,8,2,9,0,10};
		ArrayList<Integer> t = new ArrayList<>();
		ArrayList<Integer> t1 = new ArrayList<>();
		ArrayList<Integer> t2 = new ArrayList<>();
		int ic=0;
		int dc=0;
		if(a[0] < a[1])
		{
			ic=a[0];
			dc=a[1];
		}
		else
		{
			dc=a[0];
			ic=a[1];
		}
		t.add(ic);
		t1.add(dc);
		for (int i = 2; i < a.length; i++) 
		{
			if(a[i] > ic)
			{
				ic = a[i];
				t.add(a[i]);
			}
			else if(a[i] < dc)
			{
				dc = a[i];
				t1.add(a[i]);
			}
			else
				t2.add(a[i]);
		}
		System.out.println("Increment");
		System.out.println(t);
		System.out.println("Decrement");
		System.out.println(t1);
		System.out.println("Invalid");
		System.out.println(t2);
	}
	

}
