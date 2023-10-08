package arrayAttempt1;

public class SelectionSort {

	public static void main(String[] args) {
		int[] a = {5,2,6,9,8,0,2,1,80,50};
		
		for (int i = 0; i < a.length; i++) 
		{
			System.out.print(a[i]+" ");
		}
		System.out.println("\n-----------------------------");
		
		for(int j=0; j<a.length; j++)
		{
			int  min = j;
			for (int i = j+1; i < a.length; i++) 
			{
				 
				if(a[i]<a[min])
				{
					min = i;
				}
			}
			int p = a[min];
			int q = a[j];
			a[min] = q;
			a[j] = p;
//			a[min] = a[min] + a[j];
//			a[j] = a[min] - a[j];
//			a[min] = a[min] - a[j];
		}
		for (int i = 0; i < a.length; i++) 
		{
			System.out.print(a[i]+" ");
		}

	}

}
