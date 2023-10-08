package array;

public class FindSecondMinMaxWithoutSorting {

	public static void main(String[] args) {
		int[] a = {5,2,6,9,7,0,10};
		int min=Integer.MAX_VALUE;
		int max = Integer.MIN_VALUE;
		int secmin=Integer.MAX_VALUE;
		int secmax=Integer.MIN_VALUE;
		for (int i = 0; i < a.length; i++) 
		{
			if(a[i]<min)
			{
				min = a[i];
			}
		}
		for (int i = 0; i < a.length; i++) 
		{
			if(a[i]<secmin && a[i]!=min)
			{
				secmin=a[i];
			}
		}
		System.out.println("Second Min :"+secmin);
		for (int i = 0; i < a.length; i++) 
		{
			if(a[i]>max)
			{
				max=a[i];
			}
		}
		for (int i = 0; i < a.length; i++) 
		{
			if(a[i]>secmax && a[i]!=max)
			{
				secmax=a[i];
			}
		}
		System.out.println("SecondMax :"+secmax);

	}

}
