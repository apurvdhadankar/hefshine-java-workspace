package exception;

public class Ass3 {
	static void x() throws InterruptedException
	{
		y();
	}
	private static void y() throws InterruptedException {
		z();
		
	}

	private static void z() throws InterruptedException {
		Thread.sleep(500);
		System.out.println("Uncheked");
		
	}
	public static void main(String[] args) throws InterruptedException {
		y();

	}

}
