package exceptionHandlingPreee;

public class HW7 {
	public static void pqr() throws InterruptedException
	{
		System.out.println("callin xyz()");
		xyz();
	}

	private static void xyz() throws InterruptedException {
		System.out.println("callin abc()");
		abc();
		
		
	}

	private static void abc() throws InterruptedException {
		
		Thread.sleep(1000);
	}

	public static void main(String[] args) throws InterruptedException {
		pqr();

	}

}
