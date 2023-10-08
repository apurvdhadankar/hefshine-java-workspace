package Q3;

public class MyClass {

	public static void main(String[] args) {
		Stock s1 = new Stock();
		Thread1 t1 = new Thread1(s1);
		Thread2 t2 = new Thread2(s1);
		t1.start();
		t2.start();

	}

}
