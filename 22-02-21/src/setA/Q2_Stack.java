package setA;

public class Q2_Stack {
	static int[] a = new int[5];
	static int index=0;
	public static void main(String[] args) {
		push(1);
		push(2);
		push(3);
		push(4);
		push(5);
		push(6);
		push(7);
		for (int i = 0; i < a.length; i++) 
		{
			System.out.print(a[i]+" ");
		}
		System.out.println();
		
		pop();
		pop();
		pop();
		pop();
		pop();
		pop();
		pop();
		pop();
		for (int i = 0; i < a.length; i++) 
		{
			System.out.print(a[i]+" ");
		}
	}
	private static void pop() {
		if(index>0 )
		{
			System.out.println(a[--index]);
			a[index]=0;
			
		}
		else
		{
			System.out.println("Stack is Empty");
		}
		
	}
	private static void push(int i) {
		if(index<a.length)
		{
			a[index++]=i;
		}
		else
		{
			System.out.println("Stack is full");
		}
			
		
	}

}
