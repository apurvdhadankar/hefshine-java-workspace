package last_pree.arraylist;

public class MyLindexList<E> {
	
	int[] a = new int[10];
	int index=0;
	
	void add(int k)
	{
		if(index<a.length)
		{
			a[index++]=k;
		}
		else
		{
			int[] b = new int[(int) (a.length*1.5)];
			for (int i = 0; i < a.length; i++) 
			{
				b[i]=a[i];
			}
			b[index++]=k;
			a=b;
		}
	}
	void print()
	{
		for (int i = 0; i < a.length; i++) 
		{
			System.out.print(a[i]+" ");
		}
	}
}
