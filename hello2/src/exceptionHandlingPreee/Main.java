package exceptionHandlingPreee;

public class Main {

	public static void main(String[] args) {
		Biscuit b = new Biscuit();
		Producer p = new Producer(b);
		Consumer c = new Consumer(b);
		p.start();
		c.start();

	}

}
