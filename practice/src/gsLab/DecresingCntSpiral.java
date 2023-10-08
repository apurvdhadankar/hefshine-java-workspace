package gsLab;

public class DecresingCntSpiral {

	public static void main(String[] args) {
		int n=7;
		int[][] a = new int[n][n];
		int imin=0, jmin=0, imax=n-1, jmax=n-1;
		int cnt=1;
		int val=4;
		while(cnt<=n*n)
		{
			for (int i = jmin; i <= jmax; i++) 
			{
				a[imin][i]=val;
				cnt++;
			}
			for (int i = imin+1; i <= imax; i++) 
			{
				a[i][jmax]=val;
				cnt++;
			}
			for (int i = jmax-1; i >= jmin; i--) 
			{
				a[imax][i]=val;
				cnt++;
			}
			for (int i = imax-1; i >= imin+1; i--) 
			{
				a[i][jmin]=val;
				cnt++;
			}
			val--;
			imin++;
			jmin++;
			imax--;
			jmax--;
			
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
