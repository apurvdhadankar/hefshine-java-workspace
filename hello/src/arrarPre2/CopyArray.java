package arrarPre2;

public class CopyArray {

	public static void main(String[] args) {
		int[] a = {1,2,3,4,5,6,7,8,9};
		int[] b = new int[a.length];
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
