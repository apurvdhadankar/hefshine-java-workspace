package recursionPre;

public class Fibonacci {
	static int fib(int n)
	{
		if(n<=1)
		{
			return n;
		}
//		System.out.println("Here"+(n-1)+" "+(n-2));
		return fib(n-1)+fib(n-2);
	}

	public static void main(String[] args) 
	{
		int n=6;

		for (int i = 0; i < n; i++) 
		{
			System.out.println(fib(i));
		}
	}

}
