package arrayPre;

public class ReverseArray {

	public static void main(String[] args) {
		int[] a= {1,7,8,5};
		for (int i = 0; i < a.length/2; i++) 
		{
			a[i] = a[i]+a[a.length-1-i];
			a[a.length-1-i]=a[i]-a[a.length-1-i];
			a[i]=a[i]-a[a.length-1-i];
		}
		for (int i = 0; i < a.length; i++) 
		{
			System.out.print(a[i]+" ");
		}

	}

}
