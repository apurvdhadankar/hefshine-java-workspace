package exceptionHandle;

public class SecondLoop  extends Thread{

	public void run() {
		for (int i = 200; i < 300; i++) {
			System.out.println(i);
			try {Thread.sleep(100);}
			catch(Exception e) {}
		}
	}

}
