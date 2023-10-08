package multiThreading;

public class Sleep {

	public static void main(String[] args) throws Exception {
		T1 t1 = new T1();
		Thread.sleep(10000);
		t1.start();
		T2 t2 = new T2();

		t2.start();
		Thread.sleep(100);
	}

}
