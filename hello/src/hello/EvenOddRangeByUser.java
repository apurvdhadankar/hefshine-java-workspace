package hello;

import java.util.Scanner;

public class EvenOddRangeByUser {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Range - ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		for(int i=a; i<=b; i++)
		{
			if(i%2==0)
				System.out.println("Even - "+i);
			else
				System.out.println("Odd - "+i);
		}

	}

}
