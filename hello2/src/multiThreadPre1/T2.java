package multiThreadPre1;

public class T2 extends Thread{
	@Override
	public void run() {
		for (int i = 101; i < 200; i++) 
		{
			try {Thread.sleep(100);}catch(Exception e) {}
			System.out.println(i);
		}
	}

	public void getPriority(int i) {
		
		
	}

}
