package circleMT;

public class Thrad2 extends Thread {
	Circle a;
	public Thrad2(Circle a1) {
		a=a1;
	}
	@Override
	public void run() {
		a.area();
	}

}
