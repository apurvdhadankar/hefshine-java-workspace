package arrayAttempt2;

public class EvenOddAss18 {

	public static void main(String[] args) {
		int[] a = {5,6,9,7,81,28,831,32,33,35};
		for (int i = 0; i < a.length; i++) 
		{
			for (int j = i+1; j < a.length; j++) 
			{
				if(a[i]%2!=0)
				{
					a[i] = a[i]+a[j];
					a[j] = a[i]-a[j];
					a[i] = a[i]-a[j];
				}
			}
		}
		for (int i = 0; i < a.length; i++) 
		{
			System.out.print(a[i]+" ");
		}
	}

}
