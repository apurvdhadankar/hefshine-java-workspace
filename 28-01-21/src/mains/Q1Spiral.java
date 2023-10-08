package mains;

public class Q1Spiral {

	public static void main(String[] args) {
		int n=4;
		int[][] a = new int[n][n];
		int m = n*n;
		int imin=0, jmin=0, imax=a.length-1, jmax=a.length-1;
		int k=1;
		while(k<=m)
		{
			for (int i = jmin; i <= jmax; i++) 
			{
				a[imin][i]=k++;
			}
			imin++;
			for (int i = imin; i <= imax; i++) 
			{
				a[i][jmax]=k++;
			}
			jmax--;
			for (int i = jmax; i >= jmin; i--) 
			{
				a[imax][i]=k++;
			}
			imax--;
			for (int i = imax; i >= imin; i--) 
			{
				a[i][jmin]=k++;
			}
			jmin++;
		}
		for (int i = 0; i < a.length; i++) 
		{
			for (int j = 0; j < a[i].length; j++) 
			{
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}

	}

}
