package construcorPre;

public class Test {
	int n;
	Test(int n)
	{
		this.n=n;
	}
	void evenOdd()
	{
		if(n%2==0)
		{
			System.out.println("Even");
		}
		else
		{
			System.out.println("Odd");
		}
	}
	void factorial()
	{
		long mul=1;
		int i=1;
		do {
			mul*=i;
			i++;
		}while(i<=n);
		System.out.println(mul);
	}
	void sumOfDigits()
	{
		int a, res=0;
		while(n>0) {
			a=n%10;
			res=res+a;
			n=n/10;
		}
		System.out.println(res);
	}

	public static void main(String[] args) {
		Test t1 = new Test(15);
		t1.evenOdd();
		t1.factorial();
		t1.sumOfDigits();

	}

}
