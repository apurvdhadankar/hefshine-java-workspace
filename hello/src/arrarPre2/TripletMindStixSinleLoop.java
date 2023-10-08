package arrarPre2;

public class TripletMindStixSinleLoop {
	static int[] a  = {3,7,90,20,5,50,40};
	static int count=0, sum=0;
	public static void main(String[] args) {
		int k=3, min=100, avg=0,  minindex=0;
		for (int i = 0; i < a.length-k; i++) 
		{
			count=0;
			sum=0;
			giveMeVal(i, k);
			avg=sum/k;
			if(avg<min)
			{
				min=avg;
				minindex = i;
			}
		}
		System.out.println(min+" "+minindex);
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
