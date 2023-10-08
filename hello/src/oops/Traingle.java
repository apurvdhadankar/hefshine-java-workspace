package oops;

public class Traingle {
	int side1, side2, side3, angle1, angle2, angle3;
	public Traingle() {
		side1 = 10;
		side2 = 10;
		side3 = 30;
		angle1 = 45;
		angle2 = 45;
		angle3 = 90;
	}
	void trianglePerimeter() {
		int peri = side1+side2+side3;
		System.out.println("Traingle Perimeter is "+ peri);
	}
	void triangleArea() {
		double area = 0.5* side1*side3;
		System.out.println("Area "+area);
	}
	void iscoscleles() {
		if(side1==side2 || side1==side3 || side2==side3)
			System.out.println("Isosceles");
		else
			System.out.println("Not isosceles");
	}
	void equilateral() {
		if(side1==side2 && side2==side3)
			System.out.println("Equilateral");
		else
			System.out.println("Not Eqilateral");
	}
	void rightAngle() {
		if(angle1==90||angle2==90|angle3==90)
			System.out.println("RightAngle");
		else
			System.out.println("Not A RightAngle");
	}

	public static void main(String[] args) {
		Traingle t1 = new Traingle();
		t1.trianglePerimeter();
		t1.triangleArea();
		
		t1.iscoscleles();
		t1.equilateral();
		t1.rightAngle();
	}

}
