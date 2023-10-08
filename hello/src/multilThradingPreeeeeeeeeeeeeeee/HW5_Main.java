package multilThradingPreeeeeeeeeeeeeeee;

public class HW5_Main {

	public static void main(String[] args) {
		HW5 b = new HW5();
		T1HW5 t1 = new T1HW5(b);
		HW5T2 t2 = new HW5T2(b);
		t1.start();
		t2.start();

	}

}
