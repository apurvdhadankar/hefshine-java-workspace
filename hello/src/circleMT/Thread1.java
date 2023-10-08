package circleMT;

public class Thread1 extends Thread {
	Circle c;
	public Thread1(Circle c1) {
		c = c1;
	}
	@Override
	public void run() {
		c.radius(5);
		try {
			Thread.sleep(1000);
		}
		catch (Exception e) {
			
		}
	}

}
