package array;

public class EasySorting {

	public static void main(String[] args) {
		int[] a = {5,1,2,6,9,7};
		for (int i = 0; i < a.length; i++) 
		{
			for (int j = 0; j < a.length; j++) 
			{
				if(i<j && a[i]>a[j])
				{
					a[i]=a[i]+a[j];
					a[j]=a[i]-a[j];
					a[i]=a[i]-a[j];
				}
			}
		}
		for (int i = 0; i < a.length; i++) 
		{
			System.out.print(a[i]+" ");
		}

	}

}
