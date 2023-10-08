package array;

public class MaxLeatSecondMax {

	public static void main(String[] args) {
		int[] a = {2,5,9,9,7,5,6,31,31,1};
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
		System.out.println("Least Element Is : "+a[0]);
		System.out.println("Second Least is : "+a[1]);
		System.out.println("Second Max is : "+a[a.length-2]);
		System.out.println("Max Elements Is : "+a[a.length-1]);

	}

}
