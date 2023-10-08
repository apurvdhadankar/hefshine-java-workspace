package pre2;

public class UserRegistraton {

	void registerPrifile(String username, int age, String country) throws InvalidAgeExcepion, InvaidCountryException
	{
		if(country!="India")
		{
			throw new InvaidCountryException();
		}
	else if(age<18)
		{
			throw new InvalidAgeExcepion("User is a minor");
		}
			
	}
	public static void main(String[] args) throws InvalidAgeExcepion, InvaidCountryException {
		UserRegistraton ur = new UserRegistraton();
		

	}

}
