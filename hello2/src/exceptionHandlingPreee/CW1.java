package exceptionHandlingPreee;

public class CW1 {
	public void m1()
	{
		System.out.println("Method M1 Calling M2");
		m2();
	}

	private void m2() {
		int a=10, b=0;
		int res = a/b;
		System.out.println(res);
		
	}

	public static void main(String[] args) {
		CW1 c = new CW1();
		c.m1();
	}

}
