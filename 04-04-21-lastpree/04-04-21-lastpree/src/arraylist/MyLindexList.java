package arraylist;

public class MyLindexList<E> {
	
	int size=0;
	Object elements[];
	int default_capacity=10;
	
//	MyLindexList<E> e = new MyLindexList<>();
	
	void add(E e) throws NullPointerException
	{
		
		elements[size++] = e;
		if(size==elements.length)
		{
			ensurecapa();
		}
	}

	private void ensurecapa() {
		int newLength = elements.length*2;
		
	}
	
	
	void print()
	{
		for (int i = 0; i < elements.length; i++) 
		{
			System.out.print(elements[i]);
		}
	}

}
