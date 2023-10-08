
public class Q18ZeroSumSubarrays {

	public static void main(String[] args) {
		int a[] = {6,-1,-3,4,-2,2,4,6,-12,-7};
		int sum=0;
		int cnt=0;
		for (int i = 0; i < a.length; i++) 
		{
			for (int j = i; j < a.length; j++) 
			{
				sum=0;
				for (int k = i; k <= j; k++) 
				{
					sum = sum+a[k];	
				}
				if(sum==0)
					cnt++;
			}
			
		}
		System.out.println(cnt);
	}

}
