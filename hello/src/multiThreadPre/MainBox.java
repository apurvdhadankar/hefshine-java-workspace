package multiThreadPre;

public class MainBox {

	public static void main(String[] args) {
		Box b = new Box();
		Thread1 t1 = new Thread1(b);
		Thread2 t2 = new Thread2(b);
		t1.start();
		t2.start();

	}

}
