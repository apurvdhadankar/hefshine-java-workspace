package exceptionHandlingPre;

import exceptionHandle.InvalidAgeException;

public class ThrowUserDefine {

	public static void main(String[] args) throws InvalidAgeException {
		int age=202;
		if(age>21)
		{
			
			throw new InvalidAgeException("Not Allowed");
		}
		else
		{
			System.out.println("Allowed");
		}
	}

}
