package arrayAttempt1;

public class UniqueTriplets {

	public static void main(String[] args) {
		int[] a = {1,5,-8,-9,7,5,6};
		int sum=0;
		int num=2;
		for(int i=0; i<a.length; i++)
		{
			for (int j = i+1; j < a.length; j++) 
			{
				for (int j2 = j+1; j2 < a.length; j2++) 
				{
					sum=a[i]+a[j]+a[j2];
					if(sum==num)
						System.out.println(a[i]+" "+a[j]+" "+a[j2]);
					
				}
			}
		}
	}

}
