package mains;

public class AdditionOfInnerElementsQ3 {

	public static void main(String[] args) {
		int[][] a = {{1,2,3,4,4},
					{4,5,6,5},
					{7,8,9,6,5},
					{7,8,9,6,5}};
		
		int sum=0;
		for (int i = 0; i < a.length; i++) 
		{
			for (int j = 0; j < a[i].length; j++) 
			{
				if(i==0 || j==0 || j==a[i].length-1 || i==a.length-1)
				{}
				else
				{
					System.out.print(a[i][j]+" ");
					sum = sum+a[i][j];
				}
			}
			System.out.println();
		}
		System.out.println(sum);
					
	}
}


