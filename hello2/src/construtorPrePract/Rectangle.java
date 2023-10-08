package construtorPrePract;

public class Rectangle {
	int length, width;
	
	

	public Rectangle(int length, int width) {
		super();
		this.length = length;
		this.width = width;
	}
	void rectAngle() {
		int areaOfRectangle= length*width;
		System.out.println(areaOfRectangle);
	}
	void  rectanglePerimeter()
	{
		int PerimeterOfRectangle = 2*(length+width);
		System.out.println(PerimeterOfRectangle);
	}
	public static void main(String[] args) {
		Rectangle r1 = new Rectangle(5, 5);
		Rectangle r2 = new Rectangle(5, 5);
		r1.rectAngle();
		r2.rectanglePerimeter();
		

	}

}
