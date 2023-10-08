package arrayAttempt1;

public class ArrayTwoLeftAss24 {

	public static void main(String[] args) {
		int[] a = {1,5,6,9,8,7};
		int temp = a[0];
		for(int i=0; i<a.length-1; i++)
		{
			a[i] = a[i+1];
		}
		a[a.length-1]=temp;
		for (int i = 0; i < a.length; i++) 
		{
			System.out.print(a[i]+" ");
		}
	}

}
