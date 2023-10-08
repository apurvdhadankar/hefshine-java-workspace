package arrayPre;

public class MergeTwoArraysIntoThird {

	public static void main(String[] args) {
		int[] a = {1,2,35,4};
		int [] b = {2,5,6,9};
		int c[] = new int[a.length+b.length];
		for (int i = 0; i < b.length; i++) 
		{
			c[i]=a[i];
		}
		for (int i = 0; i < a.length; i++) 
		{
			c[i+a.length]=b[i];
		}
		for (int i = 0; i < c.length; i++) 
		{
			System.out.print(c[i]+" ");
		}
	}

}
