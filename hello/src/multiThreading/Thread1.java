package multiThreading;

public class Thread1 extends Thread
{
	ParleGProduction pgp;
	Thread1(ParleGProduction s)
	{
		pgp = s;
	}
	public void run() {
		
		for(int i=0 ; i<=2000; i+=20)
		{
			pgp.produce();
			try {Thread.sleep(200);
			}catch (Exception e){}
		}
	}
}
