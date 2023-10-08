package buySellBidirectonal;

public class Main {

	public static void main(String[] args) {
		Item i = new Item();
		T1 t1= new T1(i);
		T2 t2 = new T2(i);
		t1.start();
		t2.start();
	}

}
