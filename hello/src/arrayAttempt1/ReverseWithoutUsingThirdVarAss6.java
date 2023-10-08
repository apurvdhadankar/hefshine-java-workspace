package arrayAttempt1;

public class ReverseWithoutUsingThirdVarAss6 {

	public static void main(String[] args) {
		int[] a = {9,8,7,6,5,10,3,2,100};
		for (int i = 0; i < a.length/2; i++) 
		{
			
				a[i] = a[i]+a[a.length-1-i];
				a[a.length-1-i] = a[i]-a[a.length-1-i];
				a[i] = a[i]-a[a.length-1-i];
			
			
		}
		for (int i = 0; i < a.length; i++) 
		{
			System.out.print(a[i]+" ");
		}
	}

}
