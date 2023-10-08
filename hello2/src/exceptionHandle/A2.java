package exceptionHandle;

public class A2 extends Thread{
	Addition2 a;
	A2(Addition2 a)
	{
		this.a=a;
	}
 public void run() {
	for (int i = 1000; i < 2000; i++) {
		a.add();
	}
}
}
