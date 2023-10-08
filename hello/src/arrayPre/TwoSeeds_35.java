package arrayPre;

import string.FrequencyOfChar;

public class TwoSeeds_35 {

	public static void main(String[] args) {
		
		int[] a = {3,5,6,8,10,32};
		int b = findMinDist(a, a.length, 3, 10);
		System.out.println(b);
	}
	static int findMinDist(int[] a, int length, int m, int n)
	{
		int min = Integer.MAX_VALUE;
		for (int i = 0; i < a.length; i++) 
		{
			
			if(a[i]==m)
			{
				for (int j = 0; j < a.length; j++) 
				{
					if(a[j]==n && i!=j)
					{
						if(i>j)
						{
							if((i-j)<min)
								min=(i-j);
						}
						else
						{
							if((j-i)<min)
								min=(j-i);
						}
					}
				}
			}
		}
		return min;
	}

}
