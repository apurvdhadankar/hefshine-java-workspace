package exceptionHandlingPre;

public class UserRegistration {
	void userProfile(String name, int age, String country) throws InvalidCoUNtryException, InvalidAgeException
	{
		if(country.compareTo("India")!=0)
		{
			throw new InvalidCoUNtryException("Only Indians");
		}
		else if(age<18)
		{
			throw new InvalidAgeException("User is Minor");
		}
		else
		{
			System.out.println("You're Allowed");
		}
	}
	public static void main(String[] args) throws InvalidCoUNtryException, InvalidAgeException {
		UserRegistration ob = new UserRegistration();
		ob.userProfile("Kaju", 20, "India");

	}

}
