package construtorPrePract;

import java.util.Scanner;

public class Test {
	int n;
	int fact;
	int sum;
	Scanner sc = new Scanner(System.in);
	int a = sc.nextInt();
	
	
	public Test(int n, int fact, int sum) {
		super();
		this.n = n;
		this.fact = fact;
		this.sum = sum;
	}
	void evenOdd()
	{
		if(a%2==0)
			System.out.println("Even");
		else
			System.out.println("Odd");
	}
	void factorail()
	{
		long mul=1;
		int i=1;
		do {
			mul*=i;
			i++;
		}while(i<=a);
		System.out.println(mul);
	}
	void sumOfAllDigits()
	{
		int n, res=0;
		while(a>0)
		{
			n=a%10;
			res = res+n;
			a=a/10;
		}
		System.out.println(res);
	}


	public static void main(String[] args) {
		Test t1 = new Test(10, 15, 15);
		t1.evenOdd();
		t1.factorail();
		t1.sumOfAllDigits();
		

	}

}
