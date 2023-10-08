package multiThreadPre;

public class T1 extends Thread{
	
	public void run() {
		for (int i = 0; i < 100; i++) 
		{
			try {sleep(100);}catch(Exception e) {}
			System.out.println(i);
		}
	}
}
