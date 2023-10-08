import java.util.Scanner;

public class CalcUsingDoWhile {

	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter Two Numbers");
//		int a=sc.nextInt(), b=sc.nextInt();
//		System.out.println("Enter Choice");
//		int ch = sc.nextInt();
		Scanner sc = new Scanner(System.in);
		int ch;
		do
		{
			
			System.out.println("Enter Two Numbers");
			int a=sc.nextInt(), b=sc.nextInt();
			System.out.println("Enter Choice");
			ch = sc.nextInt();
				switch(ch)
				{
				case 1:
					System.out.println("Addition is "+(a+b));
					break;
				case 2:
					System.out.println("Substraction is "+(a*b));
					break;
				case 3:
					System.out.println("Multiplication is "+(a*b));
					break;
				case 4:
					System.out.println("Division is "+(a+b));
					break;
					default:
						System.out.println("INVALID CHOICE");
				}
				System.out.println("Enter 0 to continue 1 to end");
				ch = sc.nextInt();
			
		}while(ch != 1 && ch==0);
		
		

	}

}
