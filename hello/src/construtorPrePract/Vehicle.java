package construtorPrePract;


public class Vehicle {
	static String color="red";
	int wheels=4;
	static int gearsCount=5;
	Vehicle(String color, int gearsCount)
	{
		this();
//		color = a;
//		gearsCount=b;
		
		
	}
	Vehicle()
	{
		
		System.out.println(color +" "+wheels+" "+gearsCount);
//		System.out.println(color+" "+wheels+" "+gearsCount);
	}
	public static void main(String[] args) 
	{
		Vehicle car = new Vehicle();
		Vehicle car2 = new Vehicle("Black", 7);
		

	}

	
	
	}
