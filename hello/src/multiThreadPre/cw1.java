package multiThreadPre;

public class cw1 {
	public static void main(String[] args) throws InterruptedException {
		T1 t1 = new T1();
		T2 t2 = new T2();
		
		t1.start();
		t2.start();
		t1.join();
		t2.join();
		
	}

}
