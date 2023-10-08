package gsLab;

import java.util.ArrayList;

public class MaxSlidingWindow {

	public static void main(String[] args) {
		int[] a = {1,3,-1,-3,5,3,6,7};
		
		ArrayList<Integer> al = new ArrayList<>();
		int sum=0;
		int index=0;
		int k=3;
		int cnt=k
		for (int i = 0; i < a.length; i++) 
		{
			int max = Integer.MIN_VALUE;
			for (int j = i; j < cnt; j++) 
			{
				if(a[j]>max && cnt<a.length)
					max=a[j];
			}
			cnt++;
			al.add(max);
		}
		
		System.out.println(al);
	}
	
	

}
