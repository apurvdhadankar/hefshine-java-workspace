
public class Q16MaxNoInSubArray {

	public static void main(String[] args) {
		int[] a = {8, 5, 10, 7, 9, 4, 15, 12, 90, 13};
		int k=4;
		int max, j;
		for (int i = 0; i <= a.length-k; i++) 
		{
			max=a[i];
			
			for (j = 1; j < k; j++) 
			{
				
				if(a[i+j]>max)
				{
					max=a[i+j];
				}
				
			}
			System.out.println(" - > "+max+" ");
		}
	}

}
