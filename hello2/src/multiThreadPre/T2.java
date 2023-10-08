package multiThreadPre;

public class T2 extends Thread{

	public void run() {
		for (int i = 101; i < 200; i++) 
		{
			try {sleep(100);}catch(Exception e) {}
			System.out.println(i);
		}
	}

}
