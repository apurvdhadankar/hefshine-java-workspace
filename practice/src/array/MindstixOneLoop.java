package array;

public class MindstixOneLoop {

	public static void main(String[] args) {
		int[] a = {3,7,90,20,5,50,40};
		int k=3;
		int index=0;
		int cnt=0, sum=0, avg=0;
		int min = Integer.MAX_VALUE;
		for (int i = 0; i < a.length; i++) 
		{
			cnt++;
			sum=sum+a[i];
			if(cnt==k)
			{
				avg = sum/k;
				if(avg<min)
				{
					min=avg;
					index=i-k+1;
				}
				
				cnt=0;
				avg=0;
				sum=0;
			}
			
		}
		
		System.out.println(min +" "+ index);

	}

}
