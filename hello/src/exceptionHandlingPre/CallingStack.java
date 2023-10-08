package exceptionHandlingPre;

public class CallingStack {

	public static void main(String[] args) {
		try {
			apurv();
		} catch (InterruptedException e) {
			e.printStackTrace(); 
		}
	}

	private static void apurv() throws InterruptedException {
		
		System.out.println("Im calling kajuuu");
		kaju();
	}

	private static void kaju() throws InterruptedException {
		
		System.out.println("Im calling bhavi");
		bhavi();
		
	}

	private static void bhavi() throws InterruptedException {
		System.out.println(10 / 0);
		Thread.sleep(1000);
		
	}

}
