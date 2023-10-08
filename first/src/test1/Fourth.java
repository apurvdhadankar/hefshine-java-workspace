package test1;

public class Fourth {

	public static void main(String[] args) {
		int[] a = {5,2,3,6,9,1};
		
		for (int i = 0; i < a.length; i++) 
		{
			int min=i;
			for (int j = i+1; j < a.length; j++) 
			{
				if(a[j]<a[min])
				{
					min=j;
				}
			}
			int temp = a[min];
			a[min] = a[i];
			a[i] = temp;
			
		}
		for (int i = 0; i < a.length; i++) 
		{
			System.out.print(a[i]+" ");
		}

	}

}
