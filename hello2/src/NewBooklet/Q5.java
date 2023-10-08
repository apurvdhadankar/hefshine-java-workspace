package NewBooklet;

public class Q5 {

	public static void main(String[] args) {
		int[][] a = {{1,2,-1,4,20},
			{-8,-3,4,2,1},
			{3,8,10,-8,3},
			{-4,-1,1,7}};
		int max = Integer.MIN_VALUE;
		int sum=0;
		for (int i = 0; i < a.length; i++) 
		{
			
			for (int j = 0; j < a[i].length; j++) 
			{
				sum= sum+a[i][j];
			}
			
		}
		System.out.println(sum);
		
		}
	}


