package arrayPre;

public class TwoSeeds {
	
	public static void main(String[] args) {
	int[] a={1,2,3,6,9,5};
	int b = findMinDist(a, a.length, 5,1);
	System.out.println(b);

	}

	private static int findMinDist(int[] a, int length, int m, int n) {
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
