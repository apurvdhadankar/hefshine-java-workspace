package oops;

class Overload{
	void overlaod() {
		System.out.println("First");
	}
	void overload(int a) {
		System.out.println("Second");
	}
	void overload(int a, int b) {
		System.out.println("Third");
	}
	void overload(float a, float b) {
		System.out.println("Fourth");
	}
}
public class OverloadDemo {
	public static void main(String[] args) {
		Overload obj = new Overload();
		obj.overlaod();
		obj.overload(10);
		obj.overload(10, 30);
		obj.overload(15.2f, 2.5f);
	}

}
