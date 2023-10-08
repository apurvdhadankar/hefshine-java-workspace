package arrayAttempt1;

public class SumOfDiagonalAss31 {

	public static void main(String[] args) 
	{
		int a[][] = {{1,2,3,4},
					{5,6,7,8},
					{9,0,1,2},	
					{3,4,5,6}};
		int sum=0;
		for (int i = 0; i < a.length; i++) 
		{
			for (int j = 0; j < a[i].length; j++)
			{
				if(j-i==0 || i+j==3)
				{
					System.out.print(a[i][j]+" ");
					sum =sum+ a[i][j];
				}
				
			}
		}
		System.out.println();
		System.out.println(sum);

	}

}
