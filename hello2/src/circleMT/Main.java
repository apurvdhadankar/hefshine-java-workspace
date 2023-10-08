package circleMT;

public class Main {
	public static void main(String[] args) {
		Circle c = new Circle();
		Thread1 t1 = new Thread1(c);
		Thrad2 t2 = new Thrad2(c);
		t1.start();
		t2.start();
	}

}
