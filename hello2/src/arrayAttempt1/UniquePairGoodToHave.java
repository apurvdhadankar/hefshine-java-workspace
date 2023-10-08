package arrayAttempt1;

public class UniquePairGoodToHave {

	public static void main(String[] args) {
		int[] a = {2, 4, 3, 5, 6, -2, 4, 7, 8, 9};
//		for (int i = 0; i < a.length; i++) 
//		{
//			for (int j = i+1; j < a.length; j++) 
//			{
//				if(a[i]==a[j])
//				{
//					a[j]=0;
//				}
//			}
//		}
		System.out.println("-----------------------------");
		int sum=0, n=7;
		for (int i = 0; i < a.length; i++) 
		{
			for (int j = i+1; j < a.length; j++) 
			{
				sum=a[i]+a[j];
				if(sum==7)
					System.out.println(a[i]+" "+a[j]);
			}
		}
	}

}
