package arrayPre;

public class BubbleSort {

	public static void main(String[] args) {
		int a[] = {2,4,5,3,1,8,7};
		for (int i = 0; i < a.length; i++) 
		{
			for (int j = i+1; j < a.length; j++) 
			{
				if(a[i]>a[j])
				{
					a[i]= a[i]+a[j];
					a[j]=a[i]-a[j];
					a[i]=a[i]-a[j];
				}
			}
		}
		
		for (int j = 0; j < a.length; j++) {
			System.out.print(a[j]);
		}

		
	}

}
