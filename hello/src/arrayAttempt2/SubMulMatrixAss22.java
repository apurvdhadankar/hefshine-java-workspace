package arrayAttempt2;

import java.util.Scanner;

public class SubMulMatrixAss22 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int a[][] = new int[3][3];
		int b[][] = new int[3][3];
		System.out.println("Enter 3x3 matrix");
		for (int i = 0; i < a.length; i++) 
		{
			for (int j = 0; j < a[i].length; j++)
			{
				a[i][j]=sc.nextInt();
			}
			System.out.println();
		}
		
		for (int i = 0; i < a.length; i++) 
		{
			for (int j = 0; j < a[i].length; j++)
			{
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
			System.out.println("Enter 3x3 matrix");
			for (int i = 0; i < a.length; i++) 
			{
				for (int j = 0; j < a[i].length; j++)
				{
					b[i][j]=sc.nextInt();
				}
				System.out.println();
			}
			
			for (int i = 0; i < a.length; i++) 
			{
				for (int j = 0; j < a[i].length; j++)
				{
					System.out.print(a[i][j]+" ");
				}
				System.out.println();
			}
			int c[][] = new int[a.length][a.length];
			for (int i = 0; i < c.length; i++) {
				for (int j = 0; j < c[i].length; j++) {
					c[i][j] = a[i][j]-b[i][j];
					
				}
			}
			
			for (int i = 0; i < c.length; i++) {
				for (int j = 0; j < c[i].length; j++) {
					System.out.print(c[i][j]+" ");
				}
				System.out.println();
			

}
	}
}