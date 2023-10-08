package exceptionHandlingPre;

public class Ex_3 {

	public static void main(String[] args) {
		try {
			fun();
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}

	}

	private static void fun() throws InterruptedException {
		morefun();
		System.out.println("Method fun");
	}

	private static void morefun() throws InterruptedException {
		Thread.sleep(1000);
		System.out.println("More Method");
		
	}
	

}
