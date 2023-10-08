package multiThreadPre1;

public class T1 extends Thread {
	@Override
	public void run() {
		for (int i = 0; i < 100; i++) {
		try {Thread.sleep(100);}catch(Exception e) {}
		
			System.out.println(i);
		}
	}

}
