package EvenOdd;

public class MyClass
{

	public static void main(String[] args) 
	{
		EvenOdd obj=new EvenOdd();
		EvenT et=new EvenT(obj);
		OddT ot=new OddT(obj);
		et.start();
		ot.start();
		
	}

}
