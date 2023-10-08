package exceptionHandle;

public class PThread extends Thread{
	Store pts;

	public PThread(Store s) {
		pts=s;
	}
	public void run() {
		for (int i = 0; i < 1000; i++) {
		pts.produce();
				try {Thread.sleep(150);
			}catch (Exception e){}
		}
		
	}
}
