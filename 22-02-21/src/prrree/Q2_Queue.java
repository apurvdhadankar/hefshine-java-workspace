package prrree;


public class Q2_Queue {
	static int rear=0;
	static int front=0;
	static int[] a = new int[5];
	public static void main(String[] args)
	{
		add(4);
		add(5);
		add(6);
		add(7);
		add(8);
		add(9);
		add(1);
		for (int i = 0; i < a.length; i++) 
		{
			System.out.print(a[i]+" ");
		}
		System.out.println();
		
		dispaly();
		dispaly();
		dispaly();
		dispaly();
		dispaly();
		dispaly();
		
		for (int i = 0; i < a.length; i++) 
		{
			System.out.print(a[i]+" ");
		}
		
		
	}
	private static void dispaly() {
		if(front>=0 && front < rear)
		{
			System.out.println(a[front]);
			a[front]=0;
			++front;
		}
		else
		{
			System.out.println("Queue is Empty");
		}
	}
	private static void add(int i) {
		if(rear < a.length)
		{
			a[rear] = i;
			++rear;
		}
		else
		{
			System.out.println("Queue is full");
		}
	}

}
