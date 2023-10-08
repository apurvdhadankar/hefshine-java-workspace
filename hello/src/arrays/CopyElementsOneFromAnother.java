package arrays;

public class CopyElementsOneFromAnother
{

	public static void main(String[] args) 
	{
		int a[] = {10,20,30,40,50};
		int b[] = new int[a.length];
		for(int i=0; i<a.length; i++)
		{
			System.out.print(a[i]+" ");
			b[i]=a[i];
		}
		System.out.println();
		for(int i=0; i<b.length; i++)
		{
			System.out.print(b[i]+" ");
		}

	}

}
