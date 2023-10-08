package exceptionHandlingPreee;

import exceptionHandle.UserDefineException;

class NoAdmission extends Exception
{
	public NoAdmission(String s)
	{
		super(s);
	}
}
public class CW8 {
	public static void main(String[] args) throws NoAdmission {
		int gcy=2021;
		if(gcy <= 2020)
		{
			System.out.println("You can Admission");
		}
		else
		{
			throw new NoAdmission("You can't take admission");
		}
		
	}

}
