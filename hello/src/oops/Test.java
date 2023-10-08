package oops;

import java.util.Scanner;

public class Test 
{
	Scanner sc = new Scanner(System.in);
	int a;
	Test()
	{
		System.out.println("Enter number");
		a = sc.nextInt();
	}
	public void evenOdd()
	{
		if(a%2==0)
			System.out.println("Even");
	}
	public void factorialOfNumber()
	{
		long mul=1;
		int i=1;
		do {
			mul*=i;
			i++;
		}while(i<=a);
		System.out.println(mul);
	}
	public void sumOfAllDigits()
	{
		int n, res=0;
		while(a>0) {
			n=a%10;
			res=res+n;
			a=a/10;
		}
		System.out.println(res);
		
	}

	public static void main(String[] args) {
		Test t1 = new Test();
		t1.evenOdd();
		t1.factorialOfNumber();
		t1.sumOfAllDigits();
	}

}
