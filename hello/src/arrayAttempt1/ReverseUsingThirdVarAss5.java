package arrayAttempt1;

public class ReverseUsingThirdVarAss5 {

	public static void main(String[] args) {
		int[] a = {9,8,7,6,5,4,3,2,8};
		for (int i = 0; i < a.length; i++) 
		{
			a[i] = a[i]+a[a.length-1-i];
			a[a.length-1-i] = a[i]-a[a.length-1-i];
			a[i] = a[i]-a[a.length-1-i];
//			for (int j = i+1; j < a.length; j++) 
//			{
//				int p=a[i];
//				int q = a[j];
//				a[i] = q;
//				a[j] = p;
//			}
		}
		for (int i = 0; i < a.length; i++) 
		{
			System.out.print(a[i]+" ");
		}

	}

}
