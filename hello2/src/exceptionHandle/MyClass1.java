package exceptionHandle;

public class MyClass1 {

	public static void main(String[] args) {
		Store s = new Store();
		PThread pt = new PThread(s);
		CThread ct = new CThread(s);
		pt.start();
		ct.start();

	}

}
