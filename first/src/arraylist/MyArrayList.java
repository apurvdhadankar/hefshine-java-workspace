package arraylist;


public class MyArrayList {

	int[] a = new int[10];
	int index=0;
	 void add(int p)
	{
		if(index<a.length)
		{
			a[index++] = p;
		}
		else
		{
			 int newlength = (int) (a.length*1.5);
			 int[] b = new int[newlength];
			for (int i = 0; i < a.length; i++) 
			{
				b[i] = a[i];
			}
			b[index++]  = p;
			a=b;
		}
	}
	
	 void get(int p)
	 {
		 if(index<a.length)
			 for (int i = 0; i < a.length; i++) 
			 {
				 if(a[i]==p)
				 {
					 System.out.println(a[i]);
				 }
			}
		 System.out.println();
		
	 }
	
	
	void print()
	{
		for (int i = 0; i < a.length; i++) 
		{
			System.out.print(a[i]+" ");
		}
	}
	
	

}
