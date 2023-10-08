package exceptionHandle;

public class CThread extends Thread {
	Store cts;
	CThread(Store s)
	{
		cts=s;
	}

	public void run() {
		for (int i = 0; i < 1000; i++) {
			cts.consume();
			
			try {Thread.sleep(100);
			}catch (Exception e){}
		}
		

	}
}
