package hw2MT;

public class Main {

	public static void main(String[] args) throws InterruptedException {
		DaysOfWeek d = new DaysOfWeek();
		TableOf5 t = new TableOf5();
		Fibonacci f = new Fibonacci();
		d.start();
		d.join();
		t.start();
		t.join();
		f.start();

	}

}
