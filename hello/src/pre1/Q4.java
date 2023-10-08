package pre1;

public class Q4 {

	public static void main(String[] args) {
		try {
			abc();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

	}

	private static void abc() throws InterruptedException {
		pqr();
		System.out.println("Calling pqr");
		
	}

	private static void pqr() throws InterruptedException {
		xyz();
		System.out.println("Calling xyz");
	}

	private static void xyz() throws InterruptedException {
		Thread.sleep(1000);
		
	}

}
