package oopsPre;

public class AdditionDemo {
	int num1, num2, result;
	
	void addition()
	{
		result = num1+num2;
		System.out.println(result);
	}
	void substraction()
	{
		result = num1+num2;
		System.out.println(result);
	}
	void multiplication()
	{
		result = num1*num2;
		System.out.println(result);
	}
	void division()
	{
		result = num1/num2;
		System.out.println(result);
	}

	public static void main(String[] args) {
		AdditionDemo ob = new AdditionDemo();
		ob.num1=20;
		ob.num2=10;
		ob.addition();
		ob.substraction();
		ob.multiplication();
		ob.division();
	}

}
