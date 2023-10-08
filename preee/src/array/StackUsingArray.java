package array;

public class StackUsingArray {
	static int[] a = new int[5];
	static int index=0;
	public static void main(String[] args) 
	{
		push(3);
		push(4);
		push(8);
		for (int i = 0; i < a.length; i++) 
		{
			System.out.print(a[i]+" ");
		}
		System.out.println();
		System.out.println(pop());
		System.out.println(pop());
		System.out.println(pop());
		for (int i = 0; i < a.length; i++) 
		{
			System.out.print(a[i]+" ");
		}
	}
	private static int pop() {
		if(index>0)
		{	
//			a[--index] = 0;
			return a[--index]=0;
		}
		return 0;
		
	}
	private static void push(int i) {
		if(index<a.length)
		{
			a[index++] = i;
		}
		
	}

}
