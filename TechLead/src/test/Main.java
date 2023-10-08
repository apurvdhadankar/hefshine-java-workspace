package test;
 class Ovverrides {
	
		void add()
		
		
		{
		
			System.out.println("parent");
		}

}
class Child extends Ovverrides{
	
	void add()
	{
		super.add();
		System.out.println("child");
		
	}
	
}

public class Main
{
	public static void main(String[] args) {
		Child c = new Child();
		c.add();
		
	}
}