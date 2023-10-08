package arrayAttempt1;

public class Assigment4 {

	public static void main(String[] args) {
		int[] a = {-1, 5, -2, 6, -8, 9, 10, -6};
		for (int i = 0; i < a.length; i++) 
		{
			for (int j = i+1; j < a.length; j++) 
			{
				if(a[i] < a[j])
				{
					a[i] = a[i]+a[j];
					a[j] = a[i]- a[j];
					a[i] = a[i] - a[j];
				}
			}
		}
		for (int i = 0; i < a.length; i++) 
		{
			System.out.print(a[i]+" ");
		}
		

	}

}
