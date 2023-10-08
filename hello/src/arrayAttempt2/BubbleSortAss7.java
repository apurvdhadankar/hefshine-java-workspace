package arrayAttempt2;

public class BubbleSortAss7 {

	public static void main(String[] args) {
		int[] a = {100,-5,9,6,3,2,5,8,51,41};
		for(int i=0; i<a.length; i++)
		{
			for (int j = 0; j < a.length-1; j++) 
			{
//				System.out.println(a[j]+" "+a[j+1]);
				if(a[j]>a[j+1])
				{
					a[j] = a[j]+a[j+1];
					a[j+1] = a[j]-a[j+1];
					a[j] = a[j]-a[j+1];
				}
			}
		}
		for (int i = 0; i < a.length; i++) 
		{
			System.out.print(a[i]+" ");
		}
	}

}
