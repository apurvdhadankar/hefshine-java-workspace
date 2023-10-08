package oops;

public abstract class JrDev1 implements AllMethods {

	public static void main(String[] args) {
//		JrDev1 jr = new JrDev1();
//		jr.add();

	}

	public void add(int a, int b) {
		int c = a+b;
		System.out.println(c);
		
	}

	public void sub(int a, int b) {
		int c = a-b;
		System.out.println(c);
		
	}

	public  abstract void mul(int a, int b);

	public abstract void div(int a, int b);

}
