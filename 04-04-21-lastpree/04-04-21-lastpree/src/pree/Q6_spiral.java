package pree;

import java.util.Scanner;

public class Q6_spiral {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter No");
		int n=sc.nextInt();
		int[][] a = new int[n][n];
		
		int imin= 0, jmin=0, imax=a.length-1, jmax = a.length-1;
		System.out.println(jmax);
		int cnt=1;
		while(cnt<n*4)
		{
			for (int i = jmin; i < jmax; i++) 
			{
				a[imin][i]=cnt++;
			}
			imin++;
			for(int i=jmax; i<imax; i++)
			{
				a[i][jmin]=cnt++;
			}
			jmax--;
			for(int i=jmax; i>imin; i--)
			{
				a[i][jmin]=cnt++;
			}
			imax--;
			for(int i=imax; i>imin; i--)
			{
				System.out.println(cnt++);
			}
			jmin--;
		}
		
		for (int i = 0; i < a.length; i++) 
		{
			for (int j = 0; j < a[i].length; j++) 
			{
				System.out.print(a[i][j]);
			}
			System.out.println();
		}
		

	}

}
