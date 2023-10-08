package gsLab;

import java.util.Scanner;

public class PasswordValidator {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		boolean flag = false;
		if(s.length()>= 5 && s.length()<=10)
		{
			for (int i = 0; i < s.length(); i++) 
			{
				if(s.charAt(i)>=37 && s.charAt(i)<=47)
				{
					flag = true;
				}
				if(s.charAt(i)=='@' || s.charAt(i)=='#' || s.charAt(i)=='$' || s.charAt(i)=='&')
				{
					flag = true;
				}
				
			}
			if(flag)
			{
				System.out.println("valid Password");
			}
			else
				System.out.println("Invalid Password");
		}
		else
		{
			System.out.println("Invalid Password");
		}

	}

}
