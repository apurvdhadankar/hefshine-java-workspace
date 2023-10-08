package exceptionHandlingPre;

public class ThrowsDemo {

	public static void main(String[] args) throws Exception {
		int gcy=2021;
		if(gcy<=2020)
		{
			System.out.println("you can take admission");
		}
		else
		{
			throw new Exception();
		}

	}

}
