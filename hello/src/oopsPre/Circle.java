package oopsPre;

public class Circle {
	float pi=3.14f;
	void circleArea(float radius)
	{
		float area = pi*radius*radius;
		System.out.println("Area of Circel "+area);
	}
	void circumeference(float radius)
	{
		float areacircumeFernce = 2*pi*radius;
		System.out.println("Circumference "+areacircumeFernce);
	}

	public static void main(String[] args) {
		Circle c = new Circle();
		c.circleArea(2.2f);
		c.circumeference(2.2f);
		
		

	}

}
