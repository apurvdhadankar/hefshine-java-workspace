package hello;

import java.util.Scanner;

public class AlphaNumberSpecial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Char");
		char n = sc.nextLine().charAt(0);
		if((n>=65 && n<=90) || (n>=97 && n<=122))
			System.out.println("Alphabet");
		else if(n>=48 && n<=57)
			System.out.println("Number");
		else
			System.out.println("Special Charactr");
		
	}
	

}
