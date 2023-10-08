package arrays;

public class RotateAnArrayToRight {

	public static void main(String[] args) {
		int[] a = {1,2,5,4,6,7,8,9};
		int temp = a[a.length-1];
//		for (int i = a.length; i > 0; i--) 
//		{
//			a[i]=a[i-1];
//		}
//		a[0]=temp;
		System.out.print(a[a.length-1]+" ");
		for (int i = 0; i < a.length-1; i++) 
		{
			System.out.print(a[i]+" ");
			
		}
	}

}
