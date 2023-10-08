package arrayPre;

public class MindstixSingleLoop {
	static int[] a = {3,7,90,20,5,50,40};
	static int count=0, sum=0;
	public static void main(String[] args) {
		int k=3;
		int minAvg=Integer.MAX_VALUE;
		int minindex=0;
		for (int i = 0; i < a.length-k; i++) 
		{
			
			int avg=0;
			sum = 0;
			count = 0;
			giveMeval(i, k);
			avg = sum/k;
			if(avg<=minAvg)
			{
				minAvg=avg;
				minindex=i;
			}
		}
		System.out.println(minAvg+" "+minindex);
		
	}
	private static void giveMeval(int i, int k) {
		if(count < k)
		{
			sum = sum+a[i];
			count++;
			giveMeval(++i, k);
		}
		
		
	}

}
