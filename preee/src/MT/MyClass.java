package MT;

public class MyClass {

	public static void main(String[] args) {
		Biscuits b = new Biscuits();
		Thread1 t1 = new Thread1(b);
		Thread2 t2 = new Thread2(b);
		t1.start();
		t2.start();

	}

}
