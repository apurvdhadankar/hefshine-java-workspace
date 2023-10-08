package MainsPract;

public class FillDiagonallyElemts {

	public static void main(String[] args) {
		int n=5;
		int[][] a = new int[n][n];
		int cnt=0;
		for (int k = 0; k < 2*n-1; k++) 
		{
			for (int i = 0; i < a.length; i++) 
			{
				for (int j = 0; j < a[i].length; j++)
				{
					if(i+j==k)
					{
						cnt++;
						a[i][j]=cnt;
					}
				}
			}
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
