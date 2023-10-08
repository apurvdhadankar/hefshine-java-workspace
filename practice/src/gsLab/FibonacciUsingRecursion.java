package gsLab;

public class FibonacciUsingRecursion {
	static int a=0, b=1, c=0;
	static void fib(int count)
	{
		if(count>=0)
		{
			c = a+b;
			a=b;
			b=c;
			System.out.print(" "+c);
			fib(--count);
		}
	}

	public static void main(String[] args) 
	{
		int count=10;
		System.out.print(a+" "+b);
//		because 2 no already we printing
		fib(count-2);

	}

}
