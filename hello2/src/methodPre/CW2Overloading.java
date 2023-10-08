package methodPre;

public class CW2Overloading {
	int length,breadth,height,	width;
	void area(int length, int breadth)
	{
		System.out.println("Area of Rectangle "+length*breadth);
	}
	void area(int length, int breadth, int height) 
	{
			System.out.println("Area of Rectangle "+length*breadth*height);
	}
	void area(int side) 
	{
		System.out.println("Area of Square "+side*side);
	}

	public static void main(String[] args) {
		CW2Overloading ob = new CW2Overloading();
		ob.area(10, 10, 10);
		ob.area(10, 10);
		ob.area(10);

	}

}
