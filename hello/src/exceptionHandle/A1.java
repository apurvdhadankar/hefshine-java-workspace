package exceptionHandle;

public class A1 extends Thread
{
	Addition2 a;
	A1(Addition2 a)
	{
		this.a=a;
	}
 public void run() {
	 
	for (int i = 0; i < 1000; i++) {
		a.add();
	}
}
}
