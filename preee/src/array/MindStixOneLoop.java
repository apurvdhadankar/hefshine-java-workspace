package array;

public class MindStixOneLoop {

	public static void main(String[] args) {
		int[] a = {3,7,90,20,5,50,40};
		int k=3;
		int cnt=0;
		int sum=0, index=0;
		int min = Integer.MAX_VALUE;
		for (int i = 0; i < a.length; i++) 
		{
			sum=sum+a[i];
			cnt++;
			if(cnt==k)
			{
				if(min>sum/k)
				{
					min = sum/k;
					index = i-k+1;
				}
				sum=0;
				cnt=0;
			}
		}
		System.out.println(min+" "+index);

	}

}
