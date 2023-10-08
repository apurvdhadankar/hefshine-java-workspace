package exceptionHandle;

public class Addition2 {
	int i=0;
	public synchronized void add() {
		i=i+1;
	}
	public static void main(String[] args) throws Exception{
		Addition2 a = new Addition2();
		A1 a1 = new A1(a);
		A2 a2 = new A2(a);
		a1.start();
		a2.start();
		a1.join();
		a2.join();
		System.out.println(a.i);

	}

}
