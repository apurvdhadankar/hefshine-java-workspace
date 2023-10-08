package multilThradingPreeeeeeeeeeeeeeee;

public class MainCirle {

	public static void main(String[] args) {
		Cirlce_HW6 c = new Cirlce_HW6();
		Thrad1 t1 = new Thrad1(c);
		Thread2 t2 = new Thread2(c);
		t1.start();
		t2.start();

	}

}
