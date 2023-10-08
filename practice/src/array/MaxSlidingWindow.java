package array;

import java.util.ArrayList;

public class MaxSlidingWindow {

	public static void main(String[] args) {
		int[] a = {1,3,-1,-3,5,3,6,7};
//		o/p : - 3, 3, 5, 5, 6, 7
		ArrayList<Integer> al = new ArrayList<>();
		
		int k=3;
		int[] b = new int[k];
		int index=0;
		int cnt=0;
		
		int max = Integer.MIN_VALUE
		for (int i = 0; i < a.length; i++) 
		{
			for (int j = i; j < a.length; j++) 
			{
				++cnt;
				
				if(a[j]>max)
				{
					max=a[j];
				}
				if(cnt==k)
				{
					cnt=0;
					break;
				}
			}
			al.add(max);
			
		}
		System.out.println(al);

	}

}
