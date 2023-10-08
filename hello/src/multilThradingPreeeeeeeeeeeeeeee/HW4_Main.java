package multilThradingPreeeeeeeeeeeeeeee;

public class HW4_Main {

	public static void main(String[] args) throws InterruptedException {
		HW4 t1 = new HW4();
		HW4T2 t2 = new HW4T2();
		t1.start();

		t2.start();
		t1.join();
		t2.join();
	}

}
