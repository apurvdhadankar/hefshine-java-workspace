package mPract;

public class SortTwoArrays {

	public static void main(String[] args) {
		int[] a = {5,4,8,1,-8,25,57,4,7,96,36,21,47};
		int[] b = {6,2,9,3,47,7,58,96,32,21};
		for (int i = 0; i < a.length; i++) 
		{
			for (int j = 0; j < b.length; j++) 
			{
				if(a[i]>b[j])
				{
					int temp = a[i];
					a[i]=b[j];
					b[j]=temp;
					
				}
			}
		}
		for (int i = 0; i < a.length; i++) 
		{
			for (int j = i+1; j < a.length; j++) 
			{
				if(a[i]>a[j])
				{
					int temp = a[i];
					a[i] = a[j];
					a[j]=temp;
					
				}
			}
		}
		
		for (int i = 0; i < b.length; i++) 
		{
			for (int j = i+1; j < b.length; j++) 
			{
				if(b[i]>b[j])
				{
					int temp=b[i];
					b[i]=b[j];
					b[j]=temp;
				}
			}
		}
		
		
		for (int i = 0; i < a.length; i++) 
		{
			System.out.print(a[i]+" ");
		}
//		System.out.println();
		for (int i = 0; i < b.length; i++) 
		{
			System.out.print(b[i]+" ");
		}
		
	}

}
