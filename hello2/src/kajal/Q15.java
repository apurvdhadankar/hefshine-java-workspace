package kajal;

import java.util.Scanner;

public class Q15 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no ");
		int n = sc.nextInt();
		if(n<0)
		{
			System.out.println("Negative");
		}
		else if(n>0)
		{
			System.out.println("Positive");
		}
		else
			System.out.println("Zero");

	}

}
