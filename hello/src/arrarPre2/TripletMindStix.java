package arrarPre2;

public class TripletMindStix {
	static int[]  a = {3,7,90,20,5,50,40};
	static int sum=0, count=0;
	public static void main(String[] args) {
		int min=100;
		int minindx=0;
		int avg=0;
		int k=3;
		for (int i = 0; i < a.length-k; i++) 
		{
			sum=0;
			count=0;
			giveMeVal(i,k);
			avg = sum/k;
			if(avg<min)
			{
				min=avg;
				minindx=i;
			}
		}
		System.out.println(min +" "+minindx);
	}
	private static void giveMeVal(int i, int k) {
		if(count<k)
		{
			sum = sum+a[i];
			count++;
			giveMeVal(++i, k);
		}
		
	}

}
