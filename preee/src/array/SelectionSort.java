package array;

public class SelectionSort {

	public static void main(String[] args) {
		int[] a = {3,5,7,1,9,4,2};
		int min = 0;
		for (int i = 0; i < a.length; i++) 
		{
			min=i;
			for (int j = i+1; j < a.length; j++) 
			{
				if(a[j]<a[min])
				{
					min=j;
				}
			}
			int temp = a[i];
			a[i] = a[min];
			a[min] = temp;
		}
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]+" ");
		}
		
	}

}
