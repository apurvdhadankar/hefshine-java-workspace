
public class Q32_partition {

	public static void main(String[] args) {
		int[] a = {1,5,11,5};
		for (int i = 0; i < a.length; i++) 
		{
			int sum1= 0;
			int sum2 = 0;
			sum1 += a[i];
			for (int j = 0; j < a.length; j++) 
			{
				
				if(a[j]!=a[i])
				{
					sum2 += a[j];
				}
			}
			if(sum2==sum1)
			{
				System.out.println(sum2);
			}
		}

	}

}
