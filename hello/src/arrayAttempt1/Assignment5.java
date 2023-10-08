package arrayAttempt1;

public class Assignment5 {

	public static void main(String[] args) {
		int[][] a= {{1,2,3,4},
				{5,6,7,8},
				{9,0,1,2},
				{3,4,5,6}};
		for (int i = 0; i < a.length; i++) 
		{
			for (int j = 0; j < a[i].length; j++) 
			{
				System.out.print(a[j][i]+" ");
			}
			System.out.println();
		}
		int [][] b = new int[a.length][a.length];
		for (int i = 0; i < a.length; i++) 
		{
			for (int j = 0; j < a[i].length; j++) 
			{
				b[i][j]  = a[j][i];
			}
			System.out.println();
		}
		
		for (int i = 0; i < a.length; i++) 
		{
			for (int j = 0; j < a[i].length; j++) 
			{
				System.out.print(b[i][j]+" ");
			}
			System.out.println();
		}
	}

}
