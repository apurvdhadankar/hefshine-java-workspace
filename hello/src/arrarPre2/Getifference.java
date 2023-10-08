package arrarPre2;

public class Getifference {

	public static void main(String[] args) {
		int[] a = {5,8,9,6,3,1,2};
		for (int i = 0; i < a.length; i++) 
		{
			for (int j = i+1; j < a.length; j++) 
			{
				if(a[i]>a[j])
				{
					a[i]=a[i]+a[j];
					a[j]=a[i]-a[j];
					a[i]=a[i]-a[j];
				}
			}
		}
		System.out.println(a[a.length-1]-a[0]);
	}

}
