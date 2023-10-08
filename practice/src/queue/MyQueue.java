package queue;

public class MyQueue {
	static int[] a = new int[5];
	static int rear=a.length-1;
	static int front = 0;
	
	public static void main(String[] args) {
		add(1);
		add(15);
		add(16);
		add(8);
		add(7);
		
		
//		add(1);
//		add(15);
//		add(16);
//		add(8);
//		add(7);
		
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]+" ");
		}
		System.out.println();
		System.out.println(del());
		System.out.println(del());
		System.out.println(del());
		System.out.println(del());
		System.out.println(del());
		System.out.println(del());
	}

	private static int del() {
		if(front<a.length)
		{
			return a[front++];
		}
		else
		{
			System.out.println("Queue is Emplty");
		}
		return 0;

		
	}

	private static void add(int i) {
		if(rear>=0)
		{
			a[rear--]=i;
		}
		else
		{
			System.out.println("Queue is full");
		}
		
	}

}
