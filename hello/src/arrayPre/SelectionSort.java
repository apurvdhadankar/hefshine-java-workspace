package arrayPre;

public class SelectionSort {

	public static void main(String[] args) {
		int[] a = {4,5,6,9,8,4,6,1};
		int min=0;
		for (int i = 0; i < a.length; i++) 
		{
			min=i;
			for (int j = i+1; j < a.length; j++) 
			{
				if(a[j]< a[min])
				{
					min = j;
				}
			}
			int temp = a[min];
			a[min]=a[i];
			a[i]=temp;
			
		}
		for (int i = 0; i < a.length; i++) 
		{
			System.out.print(a[i]+" ");
		}
	}

}
