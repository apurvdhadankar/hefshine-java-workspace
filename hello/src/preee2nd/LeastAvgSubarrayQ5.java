package preee2nd;

public class LeastAvgSubarrayQ5 {
	static int[] a  = {3,7,90,20,5,50,40};
	static int count=0, sum=0;

	public static void main(String[] args) {
		int minAvg = Integer.MAX_VALUE;
		
		
		sum=0;
		int avg=0;
		int minindex=0;
		int k=3;
		for (int i = 0; i < a.length-k; i++) 
		{
			avg=0;
			count=0;
			sum=0;
			giveMeVal(i, k);
			avg = sum/k;
			if(avg<=minAvg)
			{
				minAvg=avg;
				minindex=i;
				
			}
		}
		System.out.println(minAvg+" "+minindex);
		
	}

	private static void giveMeVal(int i, int k) {
		if(count < k)
		{
			sum = sum+a[i];
			count++;
			giveMeVal(++i, k);
		}
		
	}

}
