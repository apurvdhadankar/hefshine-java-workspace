package arrayPre;

public class Triplets_30 {

	public static void main(String[] args) {
		int a[] = {5,1,3,4,7};

		int n=12;
		int count=0;
		int sum=0;
		for (int i = 0; i < a.length; i++) 
		{
			for (int j = i+1; j < a.length; j++) 
			{
				for (int k = j+1; k < a.length; k++) 
				{
					sum = a[i]+a[j]+a[k];
					if(sum < n)
					{
						System.out.println(a[i]+" "+a[j]+" "+a[k]);
						count++;
					}
				}
			}
		}
		System.out.println(count);

	}

}
