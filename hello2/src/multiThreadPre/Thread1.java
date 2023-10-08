package multiThreadPre;

public class Thread1  extends Thread {
	Box pts;
	public Thread1(Box pts1) {
		 pts = pts1 ;
	}
	@Override
	public void run() {
		
		for (int i = 0; i <1000; i++)
		{
			pts.produce();
			try { Thread.sleep(1000); } catch (Exception e) { }
		}
	}

}
