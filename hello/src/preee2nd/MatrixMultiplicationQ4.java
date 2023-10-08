package preee2nd;

public class MatrixMultiplicationQ4 {

	public static void main(String[] args) {
		int[][] a = {{1,2,3,},
					{4,5,6,},
					{7,8,9}};
		int[][] b = {{1,2,3,},
					{4,5,6,},
					{7,8,9,}};
		int[][] c = new int[a[0].length][a.length];
		for (int i = 0; i < a.length; i++) 
		{
			for (int j = 0; j < c[i].length; j++) 
			{
				for (int k = 0; k < c[i].length; k++) 
				{
					c[i][j] = c[i][j]+(a[i][k]*a[k][j]);
				}
			}
		}
		for (int i = 0; i < c.length; i++) 
		{
			for (int j = 0; j < c[i].length; j++) 
			{
				System.out.print(c[i][j]+" ");
			}
			System.out.println();
		}
		
		
		
		}
		
		}

	


