package pract;

public class MinAvgMindStix {
	static int[] a = {3,7,90,20,5,50,40};
	static int count=0, sum=0;

	public static void main(String[] args) 
	{
		int avg = 0;
		int minAvg =  Integer.MAX_VALUE;
		int index=0;
		int k=3;
		for (int i = 0; i < a.length-k; i++) 
		{
			count=0;
			sum=0;
			giveMeval(i , k);
			avg=sum/k;
			if(avg<minAvg)
			{
				minAvg=avg;
				index=i;
			}
		}
		System.out.println(minAvg+" "+index);
		

	}

	private static void giveMeval(int i, int k) 
	{
		if(count < k)
		{
			sum = sum+a[i];
			count++;
			giveMeval(++i, k);
		}
		
	}

}
