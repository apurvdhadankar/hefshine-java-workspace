package multiThreadPre;

public class Thread2 extends Thread{
	Box cts;
	public Thread2(Box cts1) {
		  cts=cts1;
	}
	
	@Override
	public void run() {
		for (int i = 0; i < 1000; i++) {
			cts.consume();
			try { Thread.sleep(2000); } catch (Exception e) { }
		}
	}

}
