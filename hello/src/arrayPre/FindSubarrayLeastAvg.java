package arrayPre;

public class FindSubarrayLeastAvg 
{
	static int count=0;
	static int a[] = {3,7,90,20,5,50,40};
	static int sum=0;
	public static void main(String[] args) {
		int k=3;
		int minAvg = Integer.MAX_VALUE;
		int minIndex=0;
		sum = 0;
		for (int i = 0; i < a.length-k; i++) 
		{
			count=0;
			sum=0;
			for (int j = i; j < i+k; j++)
			{
				sumCal(i,k);
			}
			int avg = sum/k;
			if(avg<minAvg)
			{
				minAvg=avg;
				minIndex=i;
			}
		}
		System.out.println("Min Avg : "+minAvg);
		System.out.println("Min Sub Array Start Index : "+minIndex);
	}
	private static void sumCal(int i, int k) 
	{
		if(count<3)
		{
			sum=sum+a[i];
			count++;
			sumCal(++i, k);
		}
	}

}
