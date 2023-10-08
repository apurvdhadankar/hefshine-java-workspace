package oddEvenMT;

public class Main {

	public static void main(String[] args) {
		OddEven oe = new OddEven();
		T1 t1 = new T1(oe);
		T2 t2 = new T2(oe);
		t1.start();
		t2.start();

	}

}
