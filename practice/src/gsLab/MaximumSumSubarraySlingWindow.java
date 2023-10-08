package gsLab;

public class MaximumSumSubarraySlingWindow {

	public static void main(String[] args) {
		int k = 3;
		int x = 20;
		int[] a = {2,3,6,4,5,8,9};
		maxSum(a, k, x);

	}

	private static void maxSum(int[] a, int k, int x) 
	{
		int sum=0, ans=0;
		int max = Integer.MIN_VALUE;
		for (int i = 0; i < k; i++) 
		{
			sum = sum+a[i];
		}
		
		if(sum<x)
		{
			ans=sum;
		}
		for (int i = k; i < a.length; i++) 
		{
			sum = sum - a[i-k];
			sum = sum+a[i];
			
			if(sum<x)
			{
				ans = Math.max(ans, sum);
			}
			
		}
		System.out.println(ans+" is max sub array sum that value is less than "+ x);
		
	}

}
