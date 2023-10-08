package MT;

public class Thread1 extends Thread {
	Biscuits b;
	public Thread1(Biscuits b) {
		this.b = b;
	}
	@Override
	public void run() {
		for (int i = 0; i < 100; i++) 
		{
			b.produce();
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
