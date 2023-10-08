package arrayAttempt2;

public class remeoveSpecificAss3 {

	public static void main(String[] args) {
		int[] a = {5,6,9,8,7,10,1,2};
		int num=8;
		for (int i = 0; i < a.length; i++)
		{
			System.out.print(a[i]+" ");
		}
		System.out.println();
		for (int i = 0; i < a.length; i++)
		{
			if(a[i]==num)
			{
				for (int j = i; j < a.length-1; j++)
				{
					a[j] = a[j+1];
				}
			}
			
		}
		for (int i = 0; i < a.length-1; i++) 
		{
			System.out.print(a[i]+" ");
		}
	}

}
