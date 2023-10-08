package pre2;

public class MinAvgTriplet {

	public static void main(String[] args) {
		int[] a = {3,7,90,20,5,50,40};
		int k=3;
		int min=Integer.MAX_VALUE;
		
		int avg=0, minAvg=0, index=0;
		for (int i = 0; i < a.length-k; i++) 
		{
			int sum=0;
			for (int j = i; j < i+k; j++) 
			{
				sum = sum+a[j];
				avg = sum/k;
			}
			if(avg<min)
			{
				min=avg;
				index=i;
			}
		}
		System.out.println("Index: "+index +" Avg: "+min);
	}

}
