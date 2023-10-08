import java.util.Scanner;

public class DispalyTableUsingLoops {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number");
		int n=sc.nextInt();
		int i=1;
		do {
			
			System.out.println(n*i);
			i++;
			
		}while(i<=10);

	}

}
