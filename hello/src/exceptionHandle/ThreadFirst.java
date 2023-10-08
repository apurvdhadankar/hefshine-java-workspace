package exceptionHandle;

public class ThreadFirst {

	public static void main(String[] args)throws Exception {
		FirstLoop f1 = new FirstLoop();
		f1.start();
		SecondLoop f2 = new SecondLoop();
		f2.start();
		f1.join();
		f2.join();
		System.out.println("My work is Done");
	}

}
