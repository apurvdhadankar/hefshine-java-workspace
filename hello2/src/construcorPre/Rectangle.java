package construcorPre;

import org.w3c.dom.css.Rect;

public class Rectangle {
	int length, width;
	
	
	public Rectangle(int length, int width) {
		super();
		this.length = length;
		this.width = width;
	}
	void rectAngle()
	{
		System.out.println(length*width);
	}
	void rectanglePerimeter()
	{
		System.out.println(2*(length+width));
	}
	public static void main(String[] args)
	{
		Rectangle ob = new Rectangle(10, 20);
		ob.rectAngle();
		ob.rectanglePerimeter();

	}

}
