package MainsPract;

public class FillDiagonally_Elements {

	public static void main(String[] args) {
		
		int n=4;
		int[][] a = new int[n][n];
		int cnt=0;
		for (int i = 0; i < 2*n-1; i++)
		{
			for (int j = 0; j < a.length; j++) 
			{
				for (int k = 0; k < a[j].length; k++)
				{
					if(j+k==i)
					{
						cnt++;
						a[j][k]=cnt;
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
