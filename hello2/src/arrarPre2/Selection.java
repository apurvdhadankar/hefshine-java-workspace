package arrarPre2;

public class Selection {

	public static void main(String[] args) {
		int[] a = {31,36,5,8,9,6,31,2,1};
		for (int i = 0; i < a.length; i++) 
		{
			int min=i;
			for (int j = i+1; j < a.length; j++) 
			{
				if(a[min]>a[j])
				{
					min=j;
				}
			}
			int temp = a[i];
			a[i]=a[min];
			a[min]=temp;
		}
		for (int i = 0; i < a.length; i++) 
		{
			System.out.print(a[i]+" ");
		}
	}

}
