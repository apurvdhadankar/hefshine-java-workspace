package arrarPre2;

public class Mindstix26 {

	public static void main(String[] args)
	{
		int[] arr={3,7,90,20,5,50,40};
		int s=3;
		findsub(arr, arr.length, s);
		
	}
	public static void findsub(int a[], int len, int s)
	{
		int avg=0, minind=0;
		int minavg= Integer.MAX_VALUE;
		for (int i = 0; i < len-2; i++) 
		{
			int sum=0;
			sum= sum+a[i]+a[i+1]+a[i+2];
			avg=sum/s;
			if(avg<minavg)
			{
				minavg=avg;
				minind=i;
			}
		}
		System.out.println("MinAvg : "+minavg+" "+"MinIndex: "+minind);
	}

}
