
public class SumOfAllSubArraysOfSizek {

	public static void main(String[] args) {
		int[] a = {1, 2, 3, 4, 5, 6};
		int k=3;
		int sum=0;
		for (int i = 0; i <= a.length-k; i++) 
		{
			sum=0;
			for (int j = i; j < k+i; j++) 
			{
				System.out.print(a[j]);
				sum += a[j];
			}
			System.out.print("-> "+sum);
			System.out.println();
		}
	}
}
