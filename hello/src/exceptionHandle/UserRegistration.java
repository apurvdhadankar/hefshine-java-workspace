package exceptionHandle;

import java.util.Scanner;

public class UserRegistration {

	public static void registerProfile(String userName , int age, String country) throws InvalidAgeException
	{
		if(age>18)
		{
			throw new InvalidAgeException("User as minor");
		}
		else if(country.compareTo("India") != 0 )
		{
			 
			 throw new InvalidAgeException("User as Minor");
		}
		else
		{
			System.out.println("Wel Come");
			System.out.println("Country is "+country);
			System.out.println("Age is "+age);
		}
		
	}
	public static void main(String[] args) throws InvalidAgeException, InvalidCoUNtryException {		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Name");
		String userName = sc.next();
		System.out.println("Enter Age");
		int age = sc.nextInt();
		System.out.println("Enter Country Name ");
		String country = sc.next();
		UserRegistration.registerProfile(userName, age, country);
		
	}

	
}

