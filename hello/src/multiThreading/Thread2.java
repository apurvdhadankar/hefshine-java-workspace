package multiThreading;

public class Thread2 extends Thread
{
	ParleGProduction sbis;
	Thread2(ParleGProduction s)
	{
		sbis = s;
	}
	public void run() {
		for (int i = 0; i < 1000; i++) {
			sbis.consume();
			
			try {Thread.sleep(200);
			}catch (Exception e){}
		}
	}
}
