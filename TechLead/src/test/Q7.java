package test;

public class Q7 {

	public static void main(String[] args) {
		int[] a = {1,3,6,9,8,7,5,51,21};
		for (int i = 0; i < a.length; i++) 
		{
			for (int j = 0; j < a.length-1-i; j++) 
			{
				if(a[j]>a[j+1])
				{
					int temp = a[j];
					a[j]=a[j+1];
					a[j+1] = temp;
				}
			}
			
		}
		
		System.out.println("Third Largest Element in an Array is "+a[a.length-3]);

	}

}
