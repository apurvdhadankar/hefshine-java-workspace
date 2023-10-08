package oops;

public class SrDev extends JrDev
{
	public void mul(int a, int b) 
	{
		int c=a*b;
		System.out.println(c);
	}
	public void div(int a, int b) 
	{
		int c=a/b;
		System.out.println(c);
	}
	public void display()
	{
		System.out.println("I am display of Child");
	}

	public static void main(String[] args) 
	{
		SrDev s1 = new SrDev();
		s1.add(10, 20);
		s1.sub(20, 10);
		s1.mul(5, 2);
		s1.div(10, 2);
		
		s1.display();
		
//		JrDev s2 = new JrDev();
//		s2.display();

	}

}
