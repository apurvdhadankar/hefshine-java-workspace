package hello;

public class TraingleisIscoEquiScalenene {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int side1=15, side2=15, side3=16;
		if(side1==side2 && side2==side3)
			System.out.println("Eqilateral Traingle");
		else if(side1 == side2 || side2==side3 || side1==side3)
			System.out.println("isosceles ");
		else
			System.out.println("Scalene");
		
	}

}
