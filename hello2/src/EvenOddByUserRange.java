import java.util.Scanner;

public class EvenOddByUserRange {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Two Numbers");
		int a=sc.nextInt();
		int b=sc.nextInt();
		for(int i=a; i<=b; i++) {
			if(a%2==0)
			{
				System.out.println("Even No "+ i);
			}
			else
			{
				System.out.println("Odd No "+ i);
			}
		}

	}

}
