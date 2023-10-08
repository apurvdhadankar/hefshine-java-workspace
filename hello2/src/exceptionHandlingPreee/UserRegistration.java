package exceptionHandlingPreee;



public class UserRegistration {
	static void userProfile(String name, int age, String country) throws InvalidAgeException, InvalidCountryException
	{
		if(country.compareToIgnoreCase("India")!=0)
		{	
			throw new InvalidCountryException("Invalid Country Exception");
		}
		else if(age<18)
		{
			throw new InvalidAgeException("User is a Minor");
		}
		else
		{
			System.out.println("You're Allowed");
		}
	}

	public static void main(String[] args) throws InvalidAgeException, InvalidCountryException {
		userProfile("chingli Man", 18, "India");

	}

}
