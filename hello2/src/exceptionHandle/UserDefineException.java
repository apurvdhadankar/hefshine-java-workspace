package exceptionHandle;

public class UserDefineException {

	public static void main(String[] args) throws Exception {
		

	int gcy = 2021;
	if(gcy<=2020)
	{
		System.out.println("You can take admission");
	}
	else
	{
		throw new NoAdmission("Sorry, you can't take admission");
	}
	}
}
