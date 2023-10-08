package recursion;

public class SingleLoopMindstixSumAndAvergeofElements {
	static int count;
	static int[] a = {3,7,90,20,5,50,40};
	static int sum;
	public static void main(String[] args) {
		
		int k=3;
		int minindex=0;
		int min = Integer.MAX_VALUE;
		for (int i = 0; i < a.length-k; i++) 
		{
			sum=0;
			count=0;
			giveMeSum(i ,k);
			int avg = sum/k;
			if(avg<min)
			{
				min=avg;
				minindex=i;
			}
		}
		System.out.println(min+" "+minindex);

	}
	private static void giveMeSum(int i, int k) 
	{
		if(count<k)
		{
		sum=sum+a[i];
		count++;
		giveMeSum(++i, k);
		}
	}

}
