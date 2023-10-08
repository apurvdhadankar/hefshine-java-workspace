package mains;

public class MaxSubArraySum {

	public static void main(String[] args) {
		int[] a = {1,2,3,4,5};
		int max = Integer.MIN_VALUE;
		int sum=0;
		for (int i = 0; i < a.length; i++) 
		{
			
			for (int j = 0; j < a.length; j++) 
			{
				sum=0;
				for (int k = i; k <= j; k++) 
				{
					sum=sum+a[k];
				}
				if(sum>max)
				{
					max=sum;
				}
			}

		}
		System.out.println(max);

	}

}
