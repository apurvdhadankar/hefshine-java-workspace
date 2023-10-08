package arrayAttempt2;

public class ZeroWithOneAss17 {

	public static void main(String[] args) {
		int[] a = {0,0,1,01,0,1,0,0,1};
		for (int i = 0; i < a.length; i++) 
		{
			if(a[i]==0)
			{
				a[i] =1;
			}
		}
		for (int i = 0; i < a.length; i++) 
		{
			System.out.print(a[i]+" ");
		}

	}

}
