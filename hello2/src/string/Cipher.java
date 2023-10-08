package string;

import java.util.Scanner;

public class Cipher {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Text ");
		String s= sc.next();
		char[] ca = s.toCharArray();
		for (int i = 0; i < ca.length; i++) 
		{
			if(ca[i]>=97 && ca[i]<=122)
			{
				ca[i] = (char)(219-ca[i]);
			}
			else if(ca[i]>=65 && ca[i]<=90)
			{
				ca[i]=(char)(155-ca[i]);
			}
		}
		for (int i = 0; i < ca.length; i++) 
		{
			if(ca[i]>=97 && ca[i]<=122)
			{
				ca[i] = (char) (ca[i]-32);
			}
		}
		for (int i = 0; i < ca.length; i++) 
		{
			System.out.print(ca[i]);
		}

	}

}
