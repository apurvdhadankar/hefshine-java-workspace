package arrays;

public class PositiveFirstThenNegative {

	public static void main(String[] args) {
		int[] a = {-1,5,6,-5,5,1,-6};
		for(int i=0; i<a.length; i++)
		{
			for(int j=i+1; j<a.length; j++)
			{
				if(a[i]<a[j])
				{
					a[i]=a[i]+a[j];
					a[j]=a[i]-a[j];
					a[i]=a[i]-a[j];
				}
			}
		}
		for(int i=0; i<a.length; i++)
		{
			System.out.print(a[i]+" ");
		}

	}

}
