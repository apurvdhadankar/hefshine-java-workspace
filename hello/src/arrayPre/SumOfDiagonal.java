package arrayPre;

public class SumOfDiagonal {

	public static void main(String[] args) {
		int[][] a = {{1,2,3},
					{4,5,6},
					{7,8,9}};
		for (int k = 0; k < a.length*2; k++) 
		{
		for (int i = 0; i < a.length; i++) 
		{
			for (int j = 0; j < a[i].length; j++) 
			{
				if(j-i==2-k)
					System.out.print(a[i][j]+" ");
			}
//			System.out.println();
		}
		System.out.println();
		}
		

	}

}
