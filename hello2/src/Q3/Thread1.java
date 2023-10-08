package Q3;

public class Thread1 extends Thread {
	Stock s;
	public Thread1(Stock s) {
		this.s=s;
	}
	@Override
	public void run() {
		for (int i = 0; i < 100; i++) 
		{
			s.produce();
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
