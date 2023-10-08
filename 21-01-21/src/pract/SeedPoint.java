package pract;

public class SeedPoint {

	public static void main(String[] args) {
		int[] a = {3,3,4,5,6,7,8};
		int b = findMinDist(a, a.length, 3, 4);
		System.out.println(b);

	}

	private static int findMinDist(int[] a, int length, int m, int n) {
		int min=100;
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
							{
								min=(i-j);
							}
						}
						if((j-i)<min)
						{
							min=(j-i);
						}
					}
					
				}
			}
			
		}
		return min;
	}

}
