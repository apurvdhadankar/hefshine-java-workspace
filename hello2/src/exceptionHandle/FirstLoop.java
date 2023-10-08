package exceptionHandle;

public class FirstLoop extends Thread 
{
	public void run() {
		for (int i = 0; i <100 ; i++) {
			System.out.println(i);
			try 
			{
				Thread.sleep(130);
			}
			catch(Exception e) {}
			
		}
	}
}
