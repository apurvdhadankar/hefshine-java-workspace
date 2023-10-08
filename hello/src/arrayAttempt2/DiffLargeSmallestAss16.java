package arrayAttempt2;

public class DiffLargeSmallestAss16 {

	public static void main(String[] args) {
		int a[] = {8,9,5,4,15,1,2};
		for (int i = 0; i < a.length; i++)
		{
			for (int j = i+1; j < a.length; j++) 
			{
				if(a[i]>a[j])
				{
				int temp = a[j];
				a[j] = a[i];
				a[i] = temp;
				}
				
			}
		}
		for (int i = 0; i < a.length; i++) 
		{
			System.out.print(a[i]+" ");
		}
		System.out.println();
		System.out.print("Difference is : ");
		System.out.println(a[a.length-1]-a[0]);

	}

}
