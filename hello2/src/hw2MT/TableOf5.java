package hw2MT;

public class TableOf5 extends Thread {
	int table=5;
	public TableOf5() {
	}
	@Override
	public void run() {
		System.out.println("Days Of Week");
		for(int i=1; i<=10; i++)
		{
			System.out.println(table*i);
		}
	}

}
