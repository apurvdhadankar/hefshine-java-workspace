package construcorPre;
	public class Vehicle
	{
		String color="Black";
		int wheels=4;
		int gearsCount=2;
		Vehicle()
		{
			System.out.println(color+" "+gearsCount);
		}
		public Vehicle(String color, int gearsCount) {
			this();
//			System.out.println(color+" "+gearsCount);
			
		}
		public static void main(String[] args) {
			Vehicle v = new Vehicle("red", 15);
			
			
		}
	}
