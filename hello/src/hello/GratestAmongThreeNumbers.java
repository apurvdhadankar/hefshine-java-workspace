package hello;

import java.util.Scanner;

public class GratestAmongThreeNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a= sc.nextInt(), b=sc.nextInt(), c= sc.nextInt();
//		if(a>b) {
//			if(a>c)
//				System.out.println("A is greater");
//			else
//				System.out.println("C is greater");
//		}
//		else {
//		if(b>a) {
//			if(b>c)
//				System.out.println("B is Greater");
//			else
//				System.out.println("C is greater");
//		}
//	}
		if(a>b && a>c) {
			System.out.println("A is greater");
		}
		else if(b>a && b>c) {
			System.out.println("B is Greater");
		}
		else if(c>a && c>b) {
			System.out.println("C is greater");
		}
		else {
			System.out.println("All Are Equal");
		}
	}

}
