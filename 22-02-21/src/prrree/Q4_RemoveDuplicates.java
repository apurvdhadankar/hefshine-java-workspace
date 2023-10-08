package prrree;

public class Q4_RemoveDuplicates {

	public static void main(String[] args) {
		int[] a = {1,1,1,1,1,2,2,3,4};
		int[] b = {1,2,4};
		int sum=0;
		for (int i = 0; i < 2; i++) 
		{
			for (int j = 0; j < b.length; j++) 
			{
				for (int k = 0; k < a.length; k++) 
				{
					if(b[j] == a[k])
					{
						for (int t = k; t < a.length-1; t++) 
						{
							a[t] = a[t+1];
						}
						a[a.length-1]=0;
						break;
					}
				}
			}
		}
		for (int i = 0; i < a.length; i++) 
		{
			if(a[i]!=0)
			{
				System.out.print(a[i]+" ");
			}
		}

	}

}
