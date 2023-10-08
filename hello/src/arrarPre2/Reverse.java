package arrarPre2;

public class Reverse {

	public static void main(String[] args) {
		int[] a = {1,2,3,4,5,6,7,8,9};
		for (int i = 0; i < a.length/2; i++) 
		{
			a[i]=a[i]+a[a.length-1-i];
			a[a.length-1-i] = a[i]-a[a.length-1-i];
			a[i]=a[i]-a[a.length-1-i];
		}
		for (int i = 0; i < a.length; i++) 
		{
			System.out.print(a[i]+" ");
		}

	}

}
