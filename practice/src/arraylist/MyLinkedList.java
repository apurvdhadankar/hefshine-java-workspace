package arraylist;

public class MyLinkedList<E> {
	Object[] a = new Object[10];
	int index=0;
	
	void add(E e)
	{
		if(index<a.length)
		{
			a[index++] = e;
		}
		else
		{
			Object[] b = new Object[(int) (a.length*1.5)];
			for (int i = 0; i < a.length; i++) 
			{
				b[i]=a[i];
			}
			b[index++]=e;
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
	int size()
	{
		 return a.length;
	}
	int get(int i)
	{
		return index;
	}
	
}
