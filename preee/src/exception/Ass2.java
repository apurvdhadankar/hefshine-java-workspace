package exception;

public class Ass2 {
	static void x()
	{
		y();
	}
	private static void y() {
		z();
		
	}
	private static void z() {
		int a=5, b=0;
		try {
		System.out.println(a/b);
		}
		catch (ArithmeticException e)
		{
			System.out.println("Arithmatic exception occurs "+e);
		}
		
	}

	public static void main(String[] args) {
		x();

	}

}
