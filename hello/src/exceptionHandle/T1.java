package exceptionHandle;

public class T1 extends Thread {
	public void run() {
		for(int i=0; i<1000; i++)
		{
			Addtion.add();
		}
	}
}
