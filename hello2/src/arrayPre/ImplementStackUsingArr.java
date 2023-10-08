package arrayPre;

public class ImplementStackUsingArr {
	static int index=0;
	static int[] a = new int[5];
	public static void main(String[] args) {  
		push(1);
		push(2);
		push(3);
		push(4);
		push(6);
		for (int p:a) 
		{
			System.out.print(p);
		}
		System.out.println();
		for (int x : a)
		{
			System.out.print(pop()+" ");
		}
//		System.out.println();
//		for (int i = 0; i < a.length; i++) 
//		{
//			System.out.print(a[i]+" ");
//		}
	}
	private static int pop() {
		if(index>0)
		
			return a[--index];
		
		return 0;
	}

	private static void push(int i) {
		if(index<a.length)
		{
			a[index] = i;
			index++;	
		}
		
		
	}

}
