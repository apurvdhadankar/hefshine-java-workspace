package array;

import java.util.Scanner;

public class Spiral {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[][] a = new int[n][n];
		int imin=0, jmin=0, imax=n-1, jmax=n-1;
		int cnt=1;
		while(cnt<=n*n)
		{
			for (int i = jmin; i <= jmax; i++) 
			{
				a[imin][i]=cnt++;
			}
			for (int i = imin+1; i <= imax; i++) 
			{
				a[i][jmax]=cnt++;
			}
			for (int i = jmax-1; i >= jmin; i--) 
			{
				a[imax][i]=cnt++;
			}
			for (int i = imax-1; i >= imin+1; i--) 
			{
				a[i][jmin]=cnt++;
			}
			imin++;
			jmin++;
			imax--;
			jmax--;
		}
		
		
		
		for (int i = 0; i < a.length; i++) 
		{
			for (int j = 0; j < a[i].length; j++) 
			{
				System.out.print(a[i][j]+ " ");
			}
			System.out.println();
		}
	}

}
