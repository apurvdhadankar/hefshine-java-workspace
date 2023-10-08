package test;

public class Q5 {

	public static void main(String[] args) {
		int[] a = {4,6,7,3,1,2,9,8};
		for (int i = 0; i < a.length; i++) 
		{
			for (int j = 0; j < a.length-1-i; j++) 
			{
				if(a[j]<a[j+1])
				{
					a[j] = a[j]+a[j+1];
					a[j+1] = a[j]-a[j+1];
					a[j] = a[j]-a[j+1];
				}
			}
		}
		for (int i = 0; i < a.length; i++) 
		{
			System.out.print(a[i]+" ");
		}
	}

}
