package oopsPre;

public class ShapeCircle {
	float pi, radius;
	public ShapeCircle(float radius) 
	{
		pi=3.14f;
		this.radius=radius;
		System.out.println("Single para Radius Val "+radius);
	}
	public ShapeCircle(float radius, float pi)
	{
		this(radius);
		this.pi=pi;
		this.radius=radius;
		System.out.println("Second Constructor "+pi+" "+radius);
		
	}

	public static void main(String[] args) {
		ShapeCircle s = new ShapeCircle(2.2f, 3.14f);
		
	}

}
