package arrayPre;

import java.util.Scanner;

public class SubMulOfMatrix {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter No. Of Rows");
		int p=sc.nextInt();
		System.out.println("Enter No. Of Cols");
		int q=sc.nextInt();
		int a[][] = new int[p][q];
		int b[][] = new int[p][q];
		int sub[][] = new int[p][q];
		int mul[][] = new int[p][q];
		for (int i = 0; i < a.length; i++) 
		{
			for (int j = 0; j < a[i].length; j++) 
			{
				a[i][j]= sc.nextInt();
			}
		}
		System.out.println("Enter Rows Cols For Second matrix");
		System.out.println("Enter No. Of Rows");
		 p=sc.nextInt();
		System.out.println("Enter No. Of Cols");
		 q=sc.nextInt();
		for (int i = 0; i < a.length; i++) 
		{
			for (int j = 0; j < a[i].length; j++) 
			{
				b[i][j]=sc.nextInt();
			}
		}
		
		for (int i = 0; i < sub.length; i++) 
		{
			for (int j = 0; j < sub[i].length; j++) 
			{
				sub[i][j]= a[i][j]-b[i][j];
			}
		}
		for (int i = 0; i < sub.length; i++) 
		{
			for (int j = 0; j < sub[i].length; j++) 
			{
				System.out.print(sub[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println("------------------------");
		
		for (int i = 0; i < mul.length; i++)
		{
			
			for (int j = 0; j < mul[i].length; j++) 
			{
//				int sum = 0;
				for (int k = 0; k < b.length; k++) 
				{
					mul[i][j] =mul[i][j]+a[i][k]*b[k][j];
					
				}
//				mul[i][j]=sum;
				
			}
			
		}
		for (int i = 0; i < mul.length; i++) 
		{
			for (int j = 0; j < mul[i].length; j++) 
			{
				System.out.print(mul[i][j]+" ");
			}
			System.out.println();
		}
		
		
		
		
		
		

	}

}
