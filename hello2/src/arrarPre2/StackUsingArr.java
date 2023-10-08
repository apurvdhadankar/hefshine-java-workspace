package arrarPre2;

public class StackUsingArr {
	static int[] a = new int[5];
	static int index=0;
	public static void main(String[] args) {
		push(1);
		push(2);
		
		System.out.println(pop());
		System.out.println(pop());
	}

	private static int pop() {
		if(index>0)
		{
			return a[--index];
		}
		return 0;
		
	}

	private static void push(int i) {
		if(index < a.length)
		{
			a[index]=i;
			index++;
		}
		
	}

}
