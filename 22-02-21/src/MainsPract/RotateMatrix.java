package MainsPract;

public class RotateMatrix {

	public static void main(String[] args) {
		int[][] a = {{1,2,3,4},
					{5,6,7,8},
					{9,0,1,2},
					{3,4,5,6}};
		
		for (int i = 0; i < a.length; i++) 
		{
			for (int j = 0; j < a[i].length; j++) 
			{
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
		int k=30;
		int imin=0, jmin=0, imax=3, jmax=3;
		int cnt=0;
		while(imin<imax)
		{
			cnt++;
			int temp = a[imin][jmin];
			for (int p = jmin; p < jmax; p++) 
			{
				a[imin][p] = a[imin][p+1];
			}
			for (int p = imin; p < imax; p++) 
			{
				a[p][jmax] = a[p+1][jmax];
			}
			for (int p = jmax; p > jmin; p--) 
			{
				a[imax][p] = a[imax][p-1];
			}
			for (int p = imax; p > imin+1; p--) 
			{
				a[p][jmin] = a[p-1][jmin];
			}
			a[imin+1][jmin] = temp;
			if(cnt==k)
			{
				cnt=0;
				jmin++;
				imin++;
				jmax--;
				imax--;
			}
		}
		System.out.println("<-------------->");
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
