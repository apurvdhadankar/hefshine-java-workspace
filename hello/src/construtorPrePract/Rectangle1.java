package construtorPrePract;

public class Rectangle1 {
	int length;
	int breadth;
	void calcRecatanglt()
	{
		int area = length*breadth;
		System.out.println(area);
	}
	public Rectangle1() {
		length=0;
		breadth=0;
	}
	

	public Rectangle1(int length, int breadth) {
		super();
		this.length = length;
		this.breadth = breadth;
		length=15;
		breadth=15;
	}
	public Rectangle1(int a)
	{
		length = a;
		breadth = a;
	}
	public static void main(String[] args) 
	{
		Rectangle1 ob = new Rectangle1();
		ob.calcRecatanglt();
		Rectangle1 ob1 = new Rectangle1(10, 20);
		ob1.calcRecatanglt();
		Rectangle1 ob2 = new Rectangle1(15);
		ob2.calcRecatanglt();
	}

}
