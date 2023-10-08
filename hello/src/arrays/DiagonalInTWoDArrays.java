package arrays;

public class DiagonalInTWoDArrays {

	public static void main(String[] args) {
		int a[][] = {{1,2,3,4},
					{5,6,7,8},
					{9,0,1,2},	
					{3,4,5,6}};
		for(int i=0 ;i<a.length; i++)
		{
			for(int j=0 ;j<a[i].length; j++)
			{
				if(i+j==3)
				{
					System.out.print(a[i][j]+" ");
				}
			}
		}

	}

}
