package oops;

public class Rectangle {
	int length, width;
	Rectangle()
	{
		length=10;
		width=20;
	}
	void rectangleArea()
	{
		int area = length*width;
		System.out.println(area);
	}
	void rectanglePerimeter(){
		 int perimeter = 2*(length+width);
		 System.out.println(perimeter);
	 }
	

	public static void main(String[] args) {
		Rectangle r1 = new Rectangle();
		r1.rectangleArea();
		r1.rectanglePerimeter();
		

	}

}
