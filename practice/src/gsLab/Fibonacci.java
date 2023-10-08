package gsLab;

public class Fibonacci {


	public static void main(String[] args) {
		int a=0, b=1, c=0;
		int fib=10;
		System.out.print(a+" "+b);
		for (int i = 2; i <= fib; i++) 
		{
			c = a+b;
			System.out.print(" "+c);
			a=b;
			b=c;
			
			
		}
		System.out.println();
		System.out.println("fib of 10 is -  "+c);

	}

}
