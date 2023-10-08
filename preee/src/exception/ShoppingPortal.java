package exception;

public class ShoppingPortal {
	public static void userProfile(String name, int age, String country) throws InvalidCountryException, InvalidAgeException
	{
		if(country.compareToIgnoreCase("India")!=0)
		{
			throw new InvalidCountryException("Paheli Furst main nikal...lavvv");
		}
		else if(age<18)
		{
			throw new InvalidAgeException("User as Minor");
		}
		else
		{
			System.out.println("You're allowed");
		}
	}

	public static void main(String[] args) throws InvalidCountryException, InvalidAgeException
	{
		userProfile("xxxx", 17, "ndia");
	}

}
