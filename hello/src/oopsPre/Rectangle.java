package oopsPre;

public class Rectangle {
	int length, breadth;
	
	void area()
	{
		int area= length*breadth;
		System.out.println(area);
	}
	public Rectangle()
	{
		length=0;
		breadth=0;
	}
	Rectangle(int a, int b)
	{
		length=a;
		breadth=b;
	}
	Rectangle(int a)
	{
		length=a;
		breadth=a;
	}
		
	public static void main(String[] args) {
		Rectangle r1 = new Rectangle();
		Rectangle r2 = new Rectangle(10, 20);
		Rectangle r3 = new Rectangle(30);
		r1.area();
		r2.area();
		r3.area();
		

	}

}
