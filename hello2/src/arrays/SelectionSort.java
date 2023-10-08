package arrays;

public class SelectionSort {

	public static void main(String[] args) {
		int[] a = {5,200,1,6,14,80,90,0,70};
		
		for(int i=0; i<a.length; i++)
		{
			int min =i;
			for(int j=i+1; j<a.length; j++)
			{
				if(a[min]>a[j])
				{
					min = j;
				}
			}
			int p=a[i];
			int q=a[min];
			a[min]=p;
			a[i]=q;
		}
		for(int i=0; i<a.length; i++)
		{
			System.out.print(a[i]+" ");
		}
	}

}
