package exception;

public class Ass1 {
	static void x()
	{
		y();
	}
	private static void y() {
		z();
		
	}
	private static void z() {
		int a=5, b=0;
		System.out.println(a/b);
		
	}
	public static void main(String[] args) {
		x();

	}

}
