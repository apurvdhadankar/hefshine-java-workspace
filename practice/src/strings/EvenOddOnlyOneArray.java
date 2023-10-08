package strings;

public class EvenOddOnlyOneArray {

	public static void main(String[] args) {
		int[] a = {1,2,3,4,5,6,7,8,9};
		for (int i = 0; i < a.length; i++) 
		{
			for (int j = i+1; j < a.length-1; j++) 
			{
				if(a[i]%2!=0)
				{
					if(a[j]%2==0)
					{
						int temp = a[i];
						a[i] = a[j];
						a[j]=temp;
					}
//					if(a[i]>a[j])
//					{
//						int temp = a[i];
//						a[i] = a[j];
//						a[j]=temp;
//					}
				}
			}
		}
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]+" ");
		}
	}

}
