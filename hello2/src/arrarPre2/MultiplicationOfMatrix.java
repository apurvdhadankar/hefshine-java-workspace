package arrarPre2;

public class MultiplicationOfMatrix {

	public static void main(String[] args) {
		int[][] a= {{1,2,3},
					{4,5,6}};
		int[][] b = {{1,2,3},
					{4,5,6}};
		int mul[][] = new int[a.length][b.length];
		for (int i = 0; i < mul.length; i++)
		{
			
			for (int j = 0; j < mul[i].length; j++) 
			{
//				int sum = 0;
				for (int k = 0; k < b.length; k++) 
				{
					mul[i][j] =mul[i][j]+(a[i][k])*(b[k][j]);
					
				}
//				mul[i][j]=sum;
				
			}	
		}
		for (int i = 0; i < mul.length; i++) 
		{
			for (int j = 0; j < mul[i].length; j++) 
			{
				System.out.print(mul[i][j]);
			}
			System.out.println();
		}
		
		
	}
	}


