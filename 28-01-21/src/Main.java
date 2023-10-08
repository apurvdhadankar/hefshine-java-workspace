
public class Main {

	public static void main(String[] args) {
		Q4 q = new Q4();
		T1 t1 = new T1(q);
		T2 t2 = new T2(q);
		t1.start();
		t2.start();
	}

}
