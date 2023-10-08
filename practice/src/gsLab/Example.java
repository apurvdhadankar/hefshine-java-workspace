package gsLab;

public class Example {
	static void add()
	{
		int a=10, b=10;
		System.out.println(a+b);
	}
	public  void sub()
	{
		int a=10, b=10;
		System.out.println(a-b);
	}

	static {
		System.out.println("In Static");
	}
	
	
	
	final public static void main(String[] args) {
		System.out.println("hello");
		Child c = new Child();
		Child c1 = new Child();
		c.add();
		c.sub();
		c1.sub();
	}
	
	

}
class Child extends Example{
	static void add()
	{
		int a=10, b=10;
		System.out.println(a+b);
	}
	
	@Override
	public void sub()
	{
		int a=1, b=10;
		System.out.println(a-b);
	}
}
