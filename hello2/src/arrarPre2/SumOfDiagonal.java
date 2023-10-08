package arrarPre2;

public class SumOfDiagonal {

	public static void main(String[] args) {
		int[][] a= {{6,3,1},
					{9,7,8},
					{2,4,5}};
		int sum=0;
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) 
			{
				if(j-i==0 || i+j==2)
				{
					sum = sum+a[i][j];
				}
			}
//			System.out.println();
			
		}
		System.out.println(sum);
	}

}
