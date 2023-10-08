package arrayPre;

public class RemoveSpecific {

	public static void main(String[] args) {
		int[] a = {4,3,6,7};
		int n=3;
		for (int i = 0; i < a.length; i++) {
			if(a[i]==n)
			{
				a[i]=0;
			}
		}
		for (int i = 0; i < a.length; i++) 
		{
			System.out.print(a[i]+" ");
		}

	}

}
