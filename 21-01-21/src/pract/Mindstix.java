package pract;

public class Mindstix {
	static int[] a= {3,7,90,20,5,50,40};
	static int count=0;
	static int sum=0;
	public static void main(String[] args) {
		int min=100;
		int minindex=0;
		int k=3;
		int minAvg=0;
		
		for (int i = 0; i <a.length- k; i++) 	
		{
			sum=0;
			count=0;
			giveMeVal(i ,k);
			minAvg=sum/k;
		
		if(minAvg < min)
		{
			min = minAvg;
			minindex=i;
		}
		}
		System.out.println(min+" "+minindex);
		
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
