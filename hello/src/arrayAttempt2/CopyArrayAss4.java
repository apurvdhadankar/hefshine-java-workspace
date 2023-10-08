package arrayAttempt2;

public class CopyArrayAss4 {

	public static void main(String[] args) {
		int[] a = {5,8,9,6,3,7};
		int b[] = new int[a.length];
		for (int i = 0; i < b.length; i++) 
		{
			System.out.print(a[i]+" ");
		}
		System.out.println();
		for (int i = 0; i < b.length; i++) 
		{
			b[i]=a[i];
		}
		for (int i = 0; i < b.length; i++) 
		{
			System.out.print(b[i]+" ");
		}

	}

}
