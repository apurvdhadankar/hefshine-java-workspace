package arrayAttempt2;

public class MatrixMultiplication {

	public static void main(String[] args) {
		int a[][] = {{1,2,3},
					{5,6,7},
					{3,4,5}};
		
		int b[][] = {{1,2,3},
					{5,6,7},
					{3,4,5}};
		int[][] c = new int[a.length][a[0].length];
		for (int i = 0; i < c.length; i++) 
		{
			for (int j = 0; j < c[i].length; j++) 
			{
				for (int k = 0; k < c.length; k++)
				{
					c[i][j]=c[i][j]+(a[i][k]*b[k][j]);
				}
			}
		}
		for (int i = 0; i < c.length; i++) 
		{
			for (int j = 0; j < c[i].length; j++) 
			{
				System.out.print(c[i][j]+ " ");
			}
			System.out.println();
		}
		
	}

}
