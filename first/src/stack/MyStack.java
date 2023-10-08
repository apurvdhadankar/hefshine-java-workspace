package stack;

import java.util.Iterator;

public class MyStack {
	static int[] a = new int[5];
	static int index = 0;
	public static void main(String[] args) {
		push(1);
		push(2);
		push(3);
		push(4);
		for (int i = 0; i < a.length; i++) 
		{
			System.out.print(a[i]);
		}
		System.out.println();
		
		pop();
		for (int i = 0; i < a.length; i++) 
		{
			System.out.print(a[i]);
		}
		System.out.println();
		
		for (int i = 0; i < a.length; i++) 
		{
			System.out.print(a[i]);
		}
		System.out.println();
		System.out.println(peek());
	}
	private static int peek() {
		if(index>0)
		{
			return a[--index];
		}
		return 0;
		
	}
	private static int pop() {
		if(index>0)
		{
			a[--index] = 0;
		}
		return 0;
		
	}
	private static void push(int i) {
		if(index< a.length)
		{
			a[index++] = i;
		}
		
	}
	

}
