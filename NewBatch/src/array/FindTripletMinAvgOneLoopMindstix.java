package array;
public class FindTripletMinAvgOneLoopMindstix 
{
	 static int[] a = {3,7,90,20,5,50,40};
	 static  int count=0, sum=0;
	 public static void main(String[] args) {
		 int k=3;
		 int min=100, minindex=0, avg=0;
		 for (int i = 0; i < a.length-k; i++) 
		 {
			 count=0;
			 sum=0;
			 givemeVal(i, k);
			 avg=sum/k;
			 if(avg<min)
			 {
				 min=avg;
				 minindex=i;
			 }
		}
		 System.out.println("Index : "+minindex+" "+"Min Avg : "+min);
	}
	private static void givemeVal(int i, int k) {
		if(count<k)
		{
			sum = sum+a[i];
			count++;
			givemeVal(++i, k);
		}
		
	}
}
