package multiThreading;

//import exceptionHandle.CThread;
//import exceptionHandle.PThread;
//import exceptionHandle.Store;

public class MyClass {
	public static void main(String[] args) {
		ParleGProduction s = new ParleGProduction();
		Thread1 t1 = new Thread1(s);
		Thread2 t2 = new Thread2(s);
		t1.start();
		t2.start();
	}
}
