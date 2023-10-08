package multiThreading;

public class SetAndGetPriorities {

	public static void main(String[] args) {
		T1 t1 = new T1();
		t1.setPriority(5);
		T2 t2 = new T2();
		t2.setPriority(6);
		int a = t1.getPriority();
		int b = t2.getPriority();
		System.out.println(a);
		System.out.println(b);
	}

}
