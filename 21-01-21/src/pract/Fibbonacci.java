package pract;

public class Fibbonacci {

	public static void main(String[] args) {
		int fib=10;
		int a=0, b=1, c=0;
		System.out.print(a+" "+b);
		for (int i = 2; i < fib; i++) 
		{
			c=a+b;
			System.out.print(" "+c);
			a=b;
			b=c;
		}
		
	}

}
