package methodPre;

public class Calculator {
	int sum, number1, number2, diff;
	int calculateSum(int number1, int number2)
	{
		sum = number1 + number2;
		return sum;
	}
	int CalculateDifference(int number1, int number2)
	{
		if(number1>number2)
		{
			diff = number1-number2;
		}
		else
			diff = number2-number1;
		return diff;
	}
	public static void main(String[] args) {
		Calculator ob = new Calculator();
		System.out.println(ob.calculateSum(30, 10));
		System.out.println(ob.CalculateDifference(90, 10));

	}

}
