package MainsPract;

public class Spiral {

	public static void main(String[] args) {
		int n=5;
		int[][] a = new int[n][n];
		int val=1;  
		int imin=0, jmin=0, imax=n-1, jmax=n-1;
		while(val<=n*n)
		{
			for (int i = jmin; i <= jmax; i++) 
			{
				a[imin][i] = val;
				val++;
			}
			for (int i = imin+1; i <= imax; i++) 
			{
				a[i][jmax] = val;
				val++;
			}
			for (int i = jmax-1; i >= jmin; i--) 
			{
				a[imax][i] = val;
				val++;
			}
			for (int i = imax-1; i >= imin+1; i--) 
			{
				a[i][jmin] = val;
				val++;
			}
			imin++;
			jmin++;
			imax--;
			jmax--;
		}
		
//		for (int i = imin+1; i <= imax; i++) 
//		{
//			a[i][jmax] = val;
//			val++;
//		}
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
