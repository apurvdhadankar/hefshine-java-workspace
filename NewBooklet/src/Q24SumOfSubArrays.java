
public class Q24SumOfSubArrays {

	public static void main(String[] args) {
		int[] a = {2, 1, 3, 4};
		int count=0;
		for (int i = 0; i < a.length; i++) 
		{
			for (int j = i+1; j < a.length; j++) 
			{
				if((a[i]+a[j])%4==0)
				{
					System.out.println(a[i]+" "+a[j]);
					count++;
				}
				for (int k = j+1; k < a.length; k++) 
				{
					if((a[i]+a[j]+a[k])%4==0)
					{
						System.out.println(a[i]+" "+a[j]+" "+a[k]);
						count++;
					}
				}
			}
		}
		System.out.println("COUNT "+count);
	}

}
