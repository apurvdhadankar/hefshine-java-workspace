package oops;

public class MethodDemoSataicInstsnce {
	int a; //instance, nonstatic
	static int b; //static, class
	void instanceMethod() {
		System.out.println("a"+a+" "+"b" +b);
		m1();
	}
	void m1() //InstanceMethod
	{
		System.out.println("m1()");
	}
	void m2() //InstanceMethod
	{
		System.out.println("m2()");
//		MethodDemoSataicInstsnce obj2 = new MethodDemoSataicInstsnce();
//		obj2.staticMethod();
	}
	static void staticMethod() {
		System.out.println("Staitc Method");
		MethodDemoSataicInstsnce obj1 = new MethodDemoSataicInstsnce();
		obj1.m1();
		obj1.m2();
		
		System.out.println("b " +b);
	}
	

	public static void main(String[] args) {
		MethodDemoSataicInstsnce.staticMethod();
		MethodDemoSataicInstsnce obj = new MethodDemoSataicInstsnce();
		obj.instanceMethod();

	}

}
