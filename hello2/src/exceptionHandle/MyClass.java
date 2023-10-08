package exceptionHandle;

public class MyClass {

	public static void main(String[] args) throws Exception {
		T1 t1 = new T1();
		T2 t2 = new T2();
		t1.start();
		t2.start();
		t1.join();
		t2.join();
		System.out.println(Addtion.i);

	}

}
