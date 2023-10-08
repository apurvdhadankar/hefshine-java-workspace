package oopsPre;

public class CW1 {
	int a,b;
	void add()
	{
		int sum=a+b;
		System.out.println(sum);
	}

	public static void main(String[] args) {
		CW1 ob = new CW1();
		ob.a=10;
		ob.b=10;
		ob.add();

	}

}
