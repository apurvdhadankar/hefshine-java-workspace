package array;

public class StackUsingArray {
	static int[] a = new int[5];
	static int index=0, count=0;

	public static void main(String[] args) {
		push(5);
		push(1);
		push(2);
		push(3);
		push(4);
		
		for(int p: a)
		{
			System.out.println(p);
		}
		System.out.println("Popped Elements Are");
		System.out.println(pop());
		System.out.println(pop());
		System.out.println(pop());
		System.out.println(pop());
		System.out.println(pop());

	}

	private static int pop() {
		if(index>0)
		{
			return a[--index];
		}
		else
		{
			System.out.println("Stack is already Empty");
			System.exit(0);
		}
		return 0;
		
	}

	private static void push(int i) {
		if(index<a.length)
		{
			a[index]=i;
			index++;
		}
		else
		{
			System.out.println("Stack capacity is full");
			System.exit(0);
		}
		
	}

}
