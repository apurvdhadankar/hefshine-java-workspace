package controlStatement;

public class Fibonacci {

	public static void main(String[] args) {
		int n=10;
		int a=0,b=1, c=0;
		System.out.print(a);
		while(c<=n)
		{
			a=b;
			b=c;
			c=a+b;
			System.out.print(" "+c);
		}

	}

}
